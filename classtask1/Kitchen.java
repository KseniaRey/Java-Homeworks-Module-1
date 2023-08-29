package org.example.classwork_29_08.classtask1;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Kitchen {
    private ExecutorService chefThreadPool; // наши повара

    public Kitchen(int chefCount) {
        chefThreadPool = Executors.newFixedThreadPool(chefCount); // Используем ThreadPool для ограничения количества одновременно работающих поваров.
    }

    public void cookDish(Dish dish) {
        chefThreadPool.execute(() -> {
            System.out.println("cooking: " + dish.getName() + " with thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(dish.getPreparationTime());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(dish.getName() + "The process was interrupted");
            }
            dish.setStatusDish(Status.READY);
            System.out.println(dish.getName() + " is ready!");
//            if ("Steak".equals(dish.getName())){
                notifyAll();
//            } else {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
        });
    }

    public void shutdown() {
        chefThreadPool.shutdownNow();
    }
}
