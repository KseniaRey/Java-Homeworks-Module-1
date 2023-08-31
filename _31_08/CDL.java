package org.example.java._31_08;

import java.util.concurrent.CountDownLatch;

public class CDL {
    static CountDownLatch countDownLatch = new CountDownLatch(3); // синхронизатор.

    private static void doService() throws InterruptedException {
        Thread.sleep(444); // поток сначала спит
        System.out.println("Everything cleaned up (1)");
        countDownLatch.countDown(); // один вызов - одна операция? 3 - 1?
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    private static void checkSMTH() throws InterruptedException {
        Thread.sleep(444); // поток сначала спит
        System.out.println("Everything was checked (2)");
        countDownLatch.countDown(); // один вызов - одна операция? 2 - 1?
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    private static void getReady() throws InterruptedException {
        Thread.sleep(444); // поток сначала спит
        System.out.println("Everything is ready (3)");
        countDownLatch.countDown(); // один вызов - одна операция? 1 - 1?
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    // после этого потоки запустятся.

    public static void main(String[] args) {
    new Employee("Mark", countDownLatch);
    new Employee("Olga", countDownLatch);
    new Employee("Elena", countDownLatch);
    new Employee("Ivan", countDownLatch);
    new Employee("John", countDownLatch);


        try {  // потому что каждый из методов выбрасывает эксепшн
            doService();
            checkSMTH();
            getReady();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
        * Так, тут важно. Нам нужно, чтобы сначала отработали потоки
        *   doService();
            checkSMTH();
            getReady();
            * НО. у нас в классе Employee вызывается поток в строке this.start(). И в мейне мы создаем экземпляры класса
            * каждый из которых создаст поток. По идее, они отработают раньше
            * doService();
            checkSMTH();
            getReady();
            * Чтобы этого избежать, мы в методе run прописываем  countDownLatch.await();, который заставляет потоки класса
            * Employee ждать, пока мы не выполним все остальные
        * */

    }
}
class Employee extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Employee(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start(); // запуск потока
    }

    @Override
    public void run() { // запускает задачу потока
        try {
            countDownLatch.await(); // ждет пока задание не будет выполнено
            /*
* Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
If the current count is zero then this method returns immediately.
If the current count is greater than zero then the current thread becomes disabled for thread scheduling purposes and lies dormant until one of two things happen:
            * */
            System.out.println(name + "start to work...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
