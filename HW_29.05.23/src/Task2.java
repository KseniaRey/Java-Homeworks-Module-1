public class Task2 {
    /*Напишите программу, которая находит наименьшее и наибольшее значение в заданном массиве.
    *
    * 1. Пройтись циклом по массиву
    * 2. Сравнить каждое значение и поместить его в переменную max
    * 3. Сравнить каждое значение и поместить его в переменную min
    * 4. Вывести результат
    * */
    static int[] array = {27, 16, 3, 6, 57, 20, 18, 9, 217, 10};

    public static void main(String[] args) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i] < min){
                    min = array[i];
                }else if (array[i] > max){
                    max = array[i];
                }
        }
        System.out.println("The min is: " + min + " " + "The max is: " + max );
    }
}
