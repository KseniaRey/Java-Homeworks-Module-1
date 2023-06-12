package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_5 {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 2};
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(2);
        list.add(81);
        list.add(29);

        // Подсчитайте среднее арифметическое всех элементов в массиве и выведите его на экран.
        int sum = 0; // --> sum
        int amount = 0; // --> amount
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            amount++;
        }
        int a = sum / amount;
        System.out.println("Average array: " + a);


        // Подсчитайте среднее арифметическое всех элементов в коллекции и выведите его на экран.
        // Эту задачу решить не получилось, результат выводится неправильный.
        int avgList = 0;
        int countAvgList = 0;
        for (int numbers : list) {
            countAvgList += numbers;
            avgList++;
        }
        double resAvg = (double) avgList / countAvgList; // среда посоветовала сделать даблом
        System.out.println("Average list: " + resAvg);
    }
}
