package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task9 {
    // Подсчитать сумму числовых значений в мапе.
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(2, 123);
        map1.put(1, 1);
        map1.put(5, 4);
        map1.put(3, 16);
        map1.put(4, 30);
        map1.put(6, 5);
        map1.put(7, 13);
        System.out.println(findSum(map1));
    }
    public static int findSum(Map<Integer, Integer> map){
        int sum = 0;
        for (Map.Entry<Integer, Integer > item : map.entrySet()) {
            sum += item.getValue();
        }
        return sum;
    }
}
