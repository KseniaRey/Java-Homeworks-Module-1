package org.example.java._31_08;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3); // разрешаем использование ресурсов только двум потокам
        new Emp("Nik", semaphore);
        new Emp("Dima", semaphore);
        new Emp("Mikhail", semaphore);
        new Emp("Oksana", semaphore);
        new Emp("Zarina", semaphore);
        new Emp("Lera", semaphore);
        new Emp("Vlad", semaphore);
        new Emp("Denys", semaphore);
        new Emp("Roman", semaphore);
        new Emp("Mich", semaphore);
    }
}

class Emp extends Thread {
    String name;
    private Semaphore semaphore;

    public Emp(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.setName("THREAD");
        this.start();
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(); // уменьшает значение счетчика на 1
            Thread.sleep(3333);
            System.out.println(name + " is waiting for....");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release(); // сюда мы тоже можем передать количество пермитов, тогда семафор "отпустит" определенное кол-во пермитов? --уточнить
        }
        /*  semaphore.acquire(); Получает разрешение от этого семафора, блокируя его до тех пор, пока оно не станет доступным или пока поток не будет прерван.
Получает разрешение, если оно доступно, и немедленно возвращается, уменьшая количество доступных разрешений на одно.
Если разрешение недоступно, текущий поток отключается в целях планирования потоков и находится в режиме ожидания до тех пор, пока не произойдет одно из двух:
Какой-то другой поток вызывает метод Release для этого семафора, и текущий поток будет следующим, которому будет назначено разрешение; или
Какой-то другой поток прерывает текущий поток.*/
    }
}
