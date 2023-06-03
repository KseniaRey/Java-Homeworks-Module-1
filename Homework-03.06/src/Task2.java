import java.util.ArrayList;

public class Task2 {
    /*Обратный порядок: Напишите метод, который принимает массив int и возвращает ArrayList, содержащий элементы
     исходного массива в обратном порядке. Уровень сложности: 4.
     */
    public static void main(String[] args) {
        int [] array = {1, 2, 4, 2, 4, 5, 6, 23, 12, 23};
        ArrayList<Integer> sortedList = reversedList(array);
        System.out.println(sortedList);
    }
    public static ArrayList<Integer> reversedList(int[] array){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            result.add(array[i]);
        }
        return result;
    }
}
