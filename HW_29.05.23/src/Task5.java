public class Task5 {
    /*
    * Задача 5 (Уровень сложности: 6):
    Напишите программу, которая проверяет, является ли заданный массив палиндромом. Палиндром - это массив, который читается одинаково вперед и назад.
    *
    * */

    public static void main(String[] args) {
        int[] array = {27, 16, 3, 6, 57, 20, 18, 3, 9, 10};
        System.out.println(isPalindrome(array));
    }

    public static boolean isPalindrome(int[] array){

    int length = array.length;
        for (int i = 0; i < length / 2; i++) {
        if (array[i] != array[length - 1 - i]){
            return false;
        }

        }
    return true;
    }
}
