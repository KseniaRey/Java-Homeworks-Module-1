import java.util.ArrayList;
import java.util.List;

public class Main {
    /*ДЗ ДЖАВА:

Уровень сложности 1 из 10:
1. Найти сумму элементов в заданном одномерном массиве.
2. Найти наибольший элемент в заданном одномерном массиве.
3. Подсчитать количество четных элементов в заданном одномерном массиве.
Уровень сложности 2 из 10:
1. Проверить, является ли заданный одномерный массив симметричным (элементы симметрично расположены относительно центра).
2. Найти произведение элементов в заданном одномерном массиве.
3. Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.
Уровень сложности 3 из 10:
1. Отсортировать заданный одномерный массив по возрастанию.
2. Проверить, является ли заданный одномерный массив палиндромом (читается одинаково слева направо и справа налево).
3. Удалить все отрицательные элементы из заданного одномерного массива.
Уровень сложности 4 из 10:
1. Найти наименьший и наибольший элементы в заданном одномерном массиве и поменять их местами.
2. Подсчитать количество элементов, которые больше среднего значения всех элементов в заданном одномерном массиве.
3. Проверить, является ли заданный одномерный массив упорядоченным по возрастанию.
Уровень сложности 5 из 10:
1. Найти второй по величине элемент в заданном одномерном массиве.
2. Перевернуть заданный одномерный массив (элементы располагаются в обратном порядке).
3. Найти наименьшую сумму двух соседних элементов в заданном одномерном массиве.
Помните, что эти задачи представляют лишь примеры, и вы можете варьировать условия и требования в соответствии
 с вашими предпочтениями и требованиями задачи.*/

    /**/
    public static void main(String[] args) {
        /*Уровень сложности 1 из 10:
1. Найти сумму элементов в заданном одномерном массиве.
2. Найти наибольший элемент в заданном одномерном массиве.
3. Подсчитать количество четных элементов в заданном одномерном массиве.*/
        int[] array1 = {1, 2, 3, 5, 6, 9, 10}; // ответ должен быть 19
        int[] array = {1, 17, -2, 13, -5, 2, -14};
        int[] arr = {1, 15, 46, 36, 26};
        int sum = sumElements(arr);
        System.out.println(sum);

        int max = findMax(arr);
        System.out.println(max);

        int amount = amountElements(arr);
        System.out.println(amount);
        /*Уровень сложности 2 из 10:
1. Проверить, является ли заданный одномерный массив симметричным (элементы симметрично расположены относительно центра).
2. Найти произведение элементов в заданном одномерном массиве.
3. Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.*/

        System.out.println(symmetric(arr));

        int mul = multiply(arr);
        System.out.println(mul);

        System.out.println(duplicates(arr));

        /*Уровень сложности 3 из 10:
1. Отсортировать заданный одномерный массив по возрастанию.
2. Проверить, является ли заданный одномерный массив палиндромом (читается одинаково слева направо и справа налево).
3. Удалить все отрицательные элементы из заданного одномерного массива.*/
        arraySort(arr);
        for (int num : arr) {
            System.out.print(num + " ");

            System.out.println(isPalindrome(arr));

            removeNegativeNumbers(array);

            System.out.println(solve(array1));

        }
    }

    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];                           // начинаем с первого элемента
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {                      // Если элемент массива больше макс,
                max = arr[i];                       // записываем его в макс (запишем каждое и будем заменять, если будет больше? Почему тогда одно значение не добавляется к другому и не получается каша? Почему лими значений равен 1?)
            }
        }
        return max;
    }

    public static int amountElements(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                amount++;
            }
        }
        return amount;
    }

    /*Уровень сложности 2 из 10*/
    public static boolean symmetric(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    public static int multiply(int[] arr){
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        return mul;
    }
    public static boolean duplicates(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {          // i < arr.length - 1, чтобы исключить сравнение последнего элемента с самим собой
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void arraySort(int[] arr){  // --> до конца не понимаю логику. решила с помощью чата.
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {  // -- почему - i - 1? предпоследний элемент? а последний недостоин, что ли?
                if (arr[j] > arr[j + 1]){  // почему тут мы работаем только с j?
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length -1; j >= 0; j--) {
                if (arr[i] != arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] removeNegativeNumbers(int[] array) {
        List<Integer> positiveNumbers;
        positiveNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveNumbers.add(array[i]);
            }
        }
        int[] result = new int[positiveNumbers.size()];
        for (int i = 0; i < positiveNumbers.size(); i++) {
            result[i] = positiveNumbers.get(i);
        }
        return result;
    }
    /*Найти наибольшую сумму подряд идущих эл массива -- ур 4*/

    public static int solve(int[] array1){ // --> делали вместе на summary

        if (array1.length == 0){ // --> проверка, что массив не пустой
            return 0;
        }
        int maxSum = array1[0];
        int curSum = array1[0];
        // идем по массиву пока эл подряд идущие, складываем их в curSum. когда разница между эл не 1, обновляем maxSum
        for (int i = 1; i < array1.length; i++) {
            if (array1[i - 1] + 1 == array1[i]){ // чтобы не было переполнения на случай если у нас есть отриц числа
                curSum += array1[i];  // пока эл идут подрят, засунь в курсум
            }else {
                if (curSum > maxSum){
                    maxSum = curSum; // если тек больше макс, обнови макс
                }
                curSum = array1[i];// после обновления макс суммы, начинаем со след эл
            }
        }
        if (curSum > maxSum){
            maxSum = curSum;
        }
        return maxSum;
    }

    }
