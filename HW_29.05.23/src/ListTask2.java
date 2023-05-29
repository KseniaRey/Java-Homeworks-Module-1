
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTask2 {
    /* Напишите метод для поиска наибольшего числа в ArrayList<Integer>.*/

    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list2.add(new Random().nextInt(20));
        }
        int result = findTheBiggestNumber(list2);
        System.out.println("The max element is: " + result);


    }
    private static int findTheBiggestNumber(List<Integer> list2){
        int max = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > max){
                max = list2.get(i);
            }
        }
        return max;
    }
}
