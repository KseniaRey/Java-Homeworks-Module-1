package MProf_15_06.HW;

import java.util.ArrayList;
import java.util.List;

public class Task14 {
    // Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(0);
        list.add(8);
        changeOrderOfElements(list);
    }
    public static void changeOrderOfElements(List<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            Integer num = list.get(i);
            System.out.println(num);
        }
    }
}
