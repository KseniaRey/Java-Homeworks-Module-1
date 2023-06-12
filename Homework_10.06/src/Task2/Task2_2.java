package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_2 {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 2};
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(2);
        list.add(81);
        list.add(29);

        // Найдите сумму всех элементов в массиве и выведите ее на экран.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма: " + sum);

        // Найдите сумму всех элементов в коллекции и выведите ее на экран.
        int sumList = 0;
        for (Integer item : list) {
            sumList += item;
        }
        System.out.println("Сумма коллекции: " + sumList);
    }
}
