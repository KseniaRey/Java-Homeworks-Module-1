package org.example.classwork_29_08.classtask1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@AllArgsConstructor
@Data
class Dish {
    private String name;

    private long preparationTime; // in milliseconds
    private Status statusDish;

}