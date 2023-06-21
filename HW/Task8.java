package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
    // Найти все ключи, значение которых состоит только из цифр.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(1, "Maria");
        map1.put(5, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");
        map1.put(6, "123");
        map1.put(7, "579");
        findValue(map1);
    }
    public static void findValue (Map<Integer, String> map){
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            String value = item.getValue();
            boolean digits = true;

            for (int i = 0; i < value.length(); i++) {
                if (!Character.isDigit(value.charAt(i))){
                    digits = false;
                    break;
                }
            }
            if (digits){
                System.out.println(item.getKey());
            }
        }
    }
}
