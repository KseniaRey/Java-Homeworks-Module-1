package org.example.java._31_08.semaphore_task;

import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
    Resources resources1 = new Resources(1, "Lika");
    Resources resources2 = new Resources(2, "Mina");
    Resources resources3 = new Resources(3, "Sarah");

    ResourceManager resourceManager1 = new ResourceManager(List.of(resources1, resources2, resources3), semaphore);
    ResourceManager resourceManager2 = new ResourceManager(List.of(resources1, resources2, resources3), semaphore);

    }
}
