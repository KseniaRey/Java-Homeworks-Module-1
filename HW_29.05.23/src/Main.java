import java.util.Random;

public class Main {
    /*Задача 1 (Уровень сложности: 4):
Напишите программу, которая находит сумму всех элементов в заданном массиве.

    1. Перебрать массив
    2. Добавить каждый элемент в переменную
    3. сложить их
    */
    static int[] array = {27, 16, 3, 6, 57, 20, 18, 9, 10};
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }
        System.out.println("Sum is " + temp);
    }
}