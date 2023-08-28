package org.example.hw_27_08;

public class Consumer extends Thread {
    private final Warehouse warehouse;
    private final int consumeAmount;

    public Consumer(Warehouse warehouse, int consumeAmount) {
        this.warehouse = warehouse;
        this.consumeAmount = consumeAmount;
    }

    @Override
    public void run() {
    while (true){
        warehouse.consume(consumeAmount);
        System.out.println("Consumer is on");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    }
}
