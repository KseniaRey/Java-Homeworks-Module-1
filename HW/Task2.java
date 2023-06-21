package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    // Найти ключ, связанный с определенным значением.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");

        System.out.println(findTheKey(map1, "Kristina"));
    }

    public static int findTheKey (Map<Integer, String> map, String value) {
        int key = 0;
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (item.getValue().equals(value)){
                key = item.getKey();
            }
        }
        return key;
    }
}
