package org.example.hw_27_08;

public class Producer extends Thread {
    private final Warehouse warehouse;
    private volatile int productionAmount;

    public Producer(Warehouse warehouse, int productionAmount) {
        this.warehouse = warehouse;
        this.productionAmount = productionAmount;
    }

//    public synchronized void produceItems(int amount){ // нужен он нам вообще, если в вайл можно достать через warehouse?
//        warehouse.produce(10);
//    }

    @Override
    public void run() {
        while(true){
            try {
                warehouse.produce(productionAmount);
                System.out.println("Producer is on");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
