import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTask3 {
    /* Напишите метод для удаления всех четных чисел из ArrayList<Integer>.*/

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(20));
        }
        delete(list);


        System.out.println("Список после удаления четных чисел: " + list);


    }

    private static void delete(List<Integer> list){
        int newArr = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            } else {
                newArr = list.get(i);
            }


        }
    }
}
