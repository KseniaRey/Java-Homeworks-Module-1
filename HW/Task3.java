package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    // Вывести на экран все ключи, у которых значение начинается с определенной буквы.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        firstLetter(map1, "M");
    }

    public static void firstLetter (Map<Integer, String> map, String letter){
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (item.getValue().startsWith(letter)){
                System.out.println(item.getKey());
            }
        }

    }
}
