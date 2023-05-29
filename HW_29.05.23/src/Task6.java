public class Task6 {
    /*Напишите программу, которая суммирует только положительные элементы в заданном массиве.
    * 1. Пройти циклом по массиву
    * 2. Проверка на положительные элементы
    * 3. Добавляем в сумму
    * */

    public static void main(String[] args) {
        int[] array = {27, 16, 3, -6, 57, 20, -18, 3, 9, 10};
        System.out.println(isPositive(array));
    }

    public static int isPositive(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
