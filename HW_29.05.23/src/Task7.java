import java.util.Scanner;

public class Task7 {
    /*Напишите программу, которая определяет, содержит ли заданный массив заданное значение.
    * 1. Создадим сканнер для возможности задать значение
    * 2. пройти циклом по массиву и сравнить полученное значение от пользователя с каждым в массиве
    * 3. Вывести true\false
    * */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {27, 16, 3, 6, 57, 20, 18, 3, 9, 10};
        int value = scanValue();
        System.out.println(isExist(array, value));

    }

    private static int scanValue(){
        System.out.println("Введите число: ");
        return sc.nextInt();
    }
    private static boolean isExist(int[] array, int value){
//        int value = scanValue();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }



}
