import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTask6 {
    /* Напишите метод для сортировки ArrayList<Integer> в порядке возрастания.
    * 1. Пройти циклом по массиву
    * 2. Вложенный цикл
    * 3. Переменная темп и полки
    * 4. или аррей сорт?
    * */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);
        numbers.add(47);
        numbers.add(2);
        numbers.add(17);

        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
