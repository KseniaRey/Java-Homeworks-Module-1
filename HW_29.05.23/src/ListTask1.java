import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ListTask1 {
    /* Напишите метод для нахождения суммы всех элементов в ArrayList<Integer>.*/


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(20));
        }
        int sum = sum(list);
        System.out.println("The sum is: " + sum);
    }
    private static int sum(List<Integer> list){
        int sumEl = 0;
        for (int i = 0; i < list.size(); i++) {
            sumEl += list.get(i);
        }
        return sumEl;

    }

}
