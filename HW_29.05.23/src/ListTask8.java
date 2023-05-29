import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTask8 { // -- вот начиная с этой задачи я не понимаю, как решить.
    /*Напишите метод, который объединяет два ArrayList<Integer> в один, удаляя дубликаты элементов.*/
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        numbers.add(5);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(6);
        list.add(3);


    }

    private static List<Integer> bothArr(List<Integer> numbers, List<Integer> list){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (numbers.get(i) == list.get(j)){
                    numbers.remove(i);
                    temp = Collections.singletonList(list.get(i));  // идея предложила
                }
            }
        }
        return temp;
    }
}
