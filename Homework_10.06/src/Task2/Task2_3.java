package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_3 {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 2};
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(2);
        list.add(81);
        list.add(29);

        // Найдите наименьшее и наибольшее значение в массиве и выведите их на экран.------
        int minValueArr = array[0];
        int maxValueArr = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValueArr){
                minValueArr = array[i];
            } if (array[i] > maxValueArr){
                maxValueArr = array[i];
            }
        }
        System.out.println("Max value is: " + maxValueArr);
        System.out.println("Min value is: " + minValueArr);

        // Найдите наименьшее и наибольшее значение в коллекции и выведите их на экран.
        int minValueList = list.get(0);
        int maxValueList = list.get(0);
        for (Integer item : list) {
            if (item < minValueList){
                minValueList = item;
            } if (item > maxValueList){
                maxValueList = item;
            }
        }
        System.out.println("Min value List is: " + minValueList);
        System.out.println("Max value List is: " + maxValueList);
    }
}
