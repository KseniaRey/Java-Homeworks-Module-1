public class Task3 {
    /*
    * Задача 3 (Уровень сложности: 5):
    Напишите программу, которая находит второй по величине элемент в заданном массиве.
    * */
    public static void main(String[] args) {
        int[] array = {27, 16, 3, 6, 57, 20, 18, 9, 10};
        int max = 0;
        int beforeMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){            // Если i больше максимального
                beforeMax = max;            // то "максимальное" запоминаем в переменную, хрянящую  предыдущее максимальное
                max = array[i];             // а максимальным становится текущее
            } else if (array[i] > beforeMax && array[i] < max){         // В случае, если текущее больше предыдущего максимального и меньше максимального, текущее становится предыдущим максимальным
                beforeMax = array[i];
            }
        }
        System.out.println("Second max element is: " + beforeMax);
    }
}
