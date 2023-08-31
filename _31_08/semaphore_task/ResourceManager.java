package org.example.java._31_08.semaphore_task;

import lombok.ToString;

import java.util.List;
import java.util.concurrent.Semaphore;
@ToString
public class ResourceManager extends Thread {
    private List<Resources> resources;
    private Semaphore semaphore;

    public ResourceManager(List<Resources> resources, Semaphore semaphore) {
        this.resources = resources;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (Resources res : resources) {
                System.out.println(res + " is waiting for....");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();
        }
    }
}
