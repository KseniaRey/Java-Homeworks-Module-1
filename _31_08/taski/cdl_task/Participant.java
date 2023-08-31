package org.example.java._31_08.taski.cdl_task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.CountDownLatch;

//@ToString
//@Getter
//@NoArgsConstructor
//@Setter
public class Participant extends Thread {
    String name;
    private boolean isReady ;
    private static CountDownLatch countDownLatch;

    public Participant(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.isReady = false;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isReady() {
        return isReady;
    }

    public static CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(new Participant().getName() + " starts to run");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
