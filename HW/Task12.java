package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task12 {
    // Очистить мапу и вывести сообщение о ее пустом состоянии.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(1, "Maria");
        map1.put(5, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        map1.put(6, "123");
        map1.put(7, "579");
        cleanMap(map1);
    }
    public static void cleanMap (Map<Integer, String> map){
        map.clear();
        if (map.isEmpty()){
            System.out.println("The map is empty");
        }
    }
}
