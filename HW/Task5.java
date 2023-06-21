package MProf_15_06.HW;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    //Найти ключ с максимальным значением.
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Maria");
        map1.put(3, "Vladislav");
        map1.put(4, "Kristina");

        System.out.println(findMaxValue(map1));
    }

    public static int findMaxValue (Map<Integer, String> map){
        int max = 0;
        String maxValue = null;
        for (Map.Entry<Integer, String> num : map.entrySet()) {
            if (maxValue == null || num.getValue().compareTo(maxValue) > 0 ){
                max = num.getKey();
                maxValue = num.getValue();
            }
        }
        return max;
    }
}
