import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTask7 {
    /*Напишите метод для нахождения второго наименьшего числа в ArrayList<Integer>.*/
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);
        numbers.add(47);
        numbers.add(2);
        numbers.add(17);

        Collections.sort(numbers);              // сортируем по возрастанию
//        return numbers.get(numbers.size() - 1); -- не сработало, сортируем в другую сторону
//        Comparator<Integer> descendingComparator = Collections.reverseOrder();
//        Collections.sort(numbers, descendingComparator);
        // не надо в другую сторону =\
        System.out.println(numbers.get(1));         // он будет под индексом 1 же?

    }

}
