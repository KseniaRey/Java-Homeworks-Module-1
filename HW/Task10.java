package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task10 {
    // Подсчитать количество ключей, у которых длина значения превышает определенную границу.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(1, "Maria");
        map1.put(5, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        map1.put(6, "123");
        map1.put(7, "579");

        System.out.println(amountOfKeys(map1, 4));
    }
    public static int amountOfKeys(Map<Integer, String> map, int bound){
        int count = 0;
        for (Map.Entry<Integer, String> numbs : map.entrySet()) {
            String value = numbs.getValue();
            if (value.length() > bound){
                count++;
            }
        }
        return count;
    }
}
