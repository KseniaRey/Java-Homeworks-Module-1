package org.example.hw_27_08;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(10);
        Producer producer = new Producer(warehouse, 5);
        Consumer consumer = new Consumer(warehouse, 3);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
