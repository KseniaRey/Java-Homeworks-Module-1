package org.example.classwork_29_08.classtask1;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dish dish1 = new Dish("Salad", 1000, Status.NEW);
        Dish dish2 = new Dish("Dessert", 2000, Status.NEW);
        Dish dish3 = new Dish("Steak", 3000, Status.NEW);
    Order order1 = Order.builder().dishes(List.of(dish1, dish2)).status(Status.NEW).build();
    Order order2 = Order.builder().dishes(List.of(dish2, dish3)).status(Status.NEW).build();
    Order order3 = Order.builder().dishes(List.of(dish1, dish2, dish3)).status(Status.NEW).build();

    OrderProcessor orderProcessor = new OrderProcessor(new Kitchen(2));
//    orderProcessor.processOrder(order1);
    orderProcessor.processOrder(order3);


    }
}
