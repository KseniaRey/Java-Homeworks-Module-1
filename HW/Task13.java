package MProf_15_06.HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task13 {
    // Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(2);
    list.add(0);
    list.add(8);
    displayElements(list);
    }
    public static void displayElements (List<Integer> list){
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
