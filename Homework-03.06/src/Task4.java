import java.util.HashSet;
import java.util.Set;

public class Task4 {
    /*Подсчет уникальных элементов: Напишите метод, который принимает массив int и возвращает количество
     уникальных элементов в этом массиве, используя Set для хранения уникальных значений. Уровень сложности: 5.*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 6, 7, 5, 9, 12, 18};
        int amount = amountOfValues(arr);
        System.out.println(amount);
    }
    public static int amountOfValues (int[] arr){
        Set<Integer> temp = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            temp.add(num);
        }
        for (int num : temp) {
            if (temp.contains(num)){
                count++;
            }
        }
        return count;
    }
}
