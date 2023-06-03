import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task3 {
    /*Поиск пересечения: Напишите метод, который принимает два массива int и возвращает Set,
     содержащий элементы, которые присутствуют и в первом, и во втором массивах. Уровень сложности: 5.
     1. Создаем два массива интов
     2. Создаем метод, принимающий массив и возвращающий сет
     3. Создаем временный лист темп, где будем сравнивать - или два хеша?
     4. Проходим циклом по массиву 1, записывая его значения в темп
     5. Проходимся по второму массиву + условие: если значение есть в первом, то добавляем во второй хеш


     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 6, 7, 8, 9, 4, 12, 45};
        int[] arr2 = {1, 3, 4, 5, 6, 2, 7, 45, 12, 18};
        Set<Integer> commonNumbers = searchElements(arr1, arr2);
        System.out.println("Common: ");
        for (int num : commonNumbers) {
            System.out.println(num);
        }
    }
    public static Set<Integer> searchElements(int[] arr1, int[] arr2){
//        ArrayList<Integer> temp = new ArrayList<>();
        Set<Integer> numbers1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        for (int num : arr1) {
            numbers1.add(num);
        }
        for (int num : arr2) {
            if (numbers1.contains(num)){
                commonElements.add(num);
            }
        }
        return commonElements;
    }
}
