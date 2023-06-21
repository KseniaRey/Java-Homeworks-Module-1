package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task11 {
    // Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(1, "Maria");
        map1.put(5, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        map1.put(6, "123");
        map1.put(7, "579");
        System.out.println(changeMaps(map1));
    }
    public static Map<String, Integer> changeMaps (Map<Integer, String> map1){
        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, String> item : map1.entrySet()) {
            Integer key = item.getKey();
            String str = item.getValue();
            map2.put(str, key);
        }
        return map2;
    }
}
