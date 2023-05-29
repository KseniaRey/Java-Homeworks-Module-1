import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTask5 {
    /* Напишите метод, который проверяет, содержит ли ArrayList<Integer> заданное число.*/
    public static void main(String[] args) {
        boolean result = isContains(12, 5);
        System.out.println(result);
    }

    private static boolean isContains(int b, int c){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            list.add(new Random().nextInt(20));
            if (list.contains(c)){
                return true;
            }
        }
        return false;
    }
}
