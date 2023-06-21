package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    // Проверить, содержит ли мапа определенное значение.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        System.out.println(isContains(map1, "Sara"));
    }

    public static boolean isContains (Map <Integer, String> map, String value){
        for (Map.Entry<Integer, String > item : map.entrySet()) {
            if (item.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
