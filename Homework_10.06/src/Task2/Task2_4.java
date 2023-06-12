package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_4 {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 2};
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(2);
        list.add(81);
        list.add(29);

        // Посчитайте количество элементов в массиве и выведите его на экран.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        System.out.println("Amount of items in array: " + count);

        // Посчитайте количество элементов в коллекции и выведите его на экран.
        int countList = 0;
        for (int num : list) {
            countList++;
        }
        System.out.println("Amount of items in list: " + countList);
    }
}
