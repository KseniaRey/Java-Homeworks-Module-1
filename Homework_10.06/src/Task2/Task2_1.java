package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_1 {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 2};
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(2);
        list.add(81);
        list.add(29);

        // Используя цикл for, переберите элементы массива и выведите каждый элемент на экран.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // Используя цикл for-each, переберите элементы коллекции и выведите каждый элемент на экран.
        for (Integer in : list) {
            System.out.println(in);
        }
    }
}
