package org.example.java._31_08.taski.cdl_task;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch1 = new CountDownLatch(3);
        Participant participant1 = new Participant("Sam", countDownLatch1 );
        Participant participant2 = new Participant("Nick", countDownLatch1 );
        Participant participant3 = new Participant("Dima", countDownLatch1 );
        Race race = new Race(new CountDownLatch(3), List.of(participant1, participant2, participant3) );

        race.changeStatus();
    }
}
