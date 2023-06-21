package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    // Проверить, содержит ли мапа определенный ключ.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        System.out.println(hasKey(map1, 1));
    }

    public static boolean hasKey(Map<Integer, String> map, int key){
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (item.getKey() == key){
                return true;
            }
        }
        return false;
    }
}
