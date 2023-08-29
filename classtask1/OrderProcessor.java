package org.example.classwork_29_08.classtask1;

import java.util.List;

class OrderProcessor {
    private Kitchen kitchen;

    public OrderProcessor(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void processOrder(Order order) throws InterruptedException {
        List<Dish> dishList = order.getDishes();
        order.setStatus(Status.COOKING);
        for (Dish dish : dishList ) {
            kitchen.cookDish(dish);
        }
        do {
            wait();
        } while (dishList.stream()
                .anyMatch(d -> !d.getStatusDish().equals(Status.READY)));
        order.setStatus(Status.READY);
        Thread.sleep(1000);
//        notifyAll();
    }
}
