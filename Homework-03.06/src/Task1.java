import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {
    /*Удаление дубликатов: Напишите метод, который принимает массив int и возвращает ArrayList,
     содержащий все уникальные элементы исходного массива, сохраняя их порядок. Уровень сложности: 4.

    1. Создаем массив
    2. Создаем метод ВЫВОДЯЩИЙ ArrayList<Integer> и ПРИНИМАЮЩИЙ массив интов
    3. Создаем хеш сет, так как он не хранит повторяющиеся значения, следовательно все записанное будет уникальным
    4. Для каждого элемента массива arr: если число добавляется в хеш, то добавь его и в result
    -- вопрос: хеш просто не позволяет записать в себя значение, которое в нем уже есть или перезаписывает его? (попробовать)
    5. Создаем в мейне арейлист с результатами, добавляем к нему р-тат метода
    6. Выводим каждый элемент
     */
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 2, 4, 5, 6, 23, 12, 23};
        ArrayList<Integer> uniqueResult = onlyUnique(arr);
        System.out.println("Уникальные: ");
        for (int num : uniqueResult) {
            System.out.println(num);
        }

        }

    public static ArrayList<Integer> onlyUnique (int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (hashSet.add(num)){
                result.add(num);
            }
        }
        return result;
    }
}
