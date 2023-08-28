package org.example.hw_27_08;

import lombok.Getter;

@Getter
public class Warehouse {
    private volatile int capacity;
    private volatile int availableItems;

    public Warehouse(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void produce(int amount){
        while ((availableItems + amount) > capacity){ // проверка н азанятость склада
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        availableItems += amount;
        System.out.println("The Items were successfully added");
        notifyAll(); // говорим потокам, что товары доступны
    }
    public synchronized void consume(int amount){ // обяхательно синхронизируем, вычитание и сложение сделают нам хаос
        while (amount > availableItems){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        availableItems -= amount;
        System.out.println("The Items were successfully consumed");
        notifyAll(); // место свободно
    }

}
