package org.example.java._31_08.semaphore_task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Resources {
    /*
    * Вы хотите ограничить количество потоков, которые могут одновременно
достучаться к определенному ресурсу (например, к базе данных).

Создайте класс Resource (ресурс), представляющий некоторый общий ресурс, к которому потоки должны получать доступ.
Создайте класс ResourceManager, который будет ограничивать доступ к ресурсу с использованием Semaphore.
Реализуйте код, который запускает несколько потоков, пытающихся получить доступ к ресурсу.
    * */
    private int id;
    private String name;

    public Resources(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
