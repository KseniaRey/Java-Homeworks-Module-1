package org.example.classwork_29_08.classtask1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Builder
class Order {
    private String id = generateId();
    private List<Dish> dishes;

    @Setter
    private Status status;

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    private String generateId(){
        return "O" + (int)Math.random()*1000;
    }
}