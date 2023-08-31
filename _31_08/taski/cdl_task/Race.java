package org.example.java._31_08.taski.cdl_task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Race {
    /*Вы хотите организовать соревнование, где несколько
участников будут стартовать одновременно, как только все они будут готовы.

Создайте класс Participant, представляющий участника.
Создайте класс Race, который будет организовывать соревнование с использованием CountDownLatch.
Реализуйте код, который создает участников и запускает соревнование.*/
    private static CountDownLatch countDownLatch;
    private static List<Participant> participants;

    public Race(CountDownLatch countDownLatch, List<Participant> participants) {
        this.countDownLatch = countDownLatch;
        this.participants = participants;
    }

    public static void changeStatus() {
        try {
            for (Participant par : participants) {
                par.setReady(true);
                countDownLatch.countDown();
                Thread.sleep(3000);
            }
            System.out.println("---");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
