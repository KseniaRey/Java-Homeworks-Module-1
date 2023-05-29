import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTask4 {
    /* Напишите метод для определения количества положительных чисел в ArrayList<Integer>*/
    static int count = 0;   // не спрашивайте почему она здесь
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(20));
        }

        findPositive(list);
        System.out.println("Положительных чисел: " + count);
    }

    public static void  findPositive(List<Integer> list){

        for (int i = 0; i < list.get(i); i++) {
            if (list.get(i) >= 0){
                count++;
            }
        }
    }
}
