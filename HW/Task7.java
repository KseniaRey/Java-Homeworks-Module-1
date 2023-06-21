package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    // Подсчитать количество ключей, значение которых содержит определенное слово.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(1, "Maria");
        map1.put(5, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        System.out.println(findValue(map1, "Maria"));

    }
    public static int findValue (Map<Integer, String> map, String word) {
        int count = 0;
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (item.getValue().contains(word)){
                count++;
            }
        }
        return count;
    }
}
