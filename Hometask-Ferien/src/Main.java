import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = 10;
    static int b = 15;

    static int value;

    public static void main(String[] args) {
        numbers();
        numbersWhile();
        numbersDoWhile();
        isEqual(a, b);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        System.out.println("The value is: " + value);
        Cat cat = new Cat("Samantha", 5, 8);
        cat.out();
        cat.setAge(6);
    }

    /*
    Все циклы позволяют выполнять определенный кусочек кода несколько раз.
     * Самый контролируемый. С его помощью можно удалять элементы из массива, например.
     * */
    public static void numbers() {  //Вывести числа от одного до десяти при помощи каждого цикла. Объяснить в чем удобство каждого цикла
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    /*
     * Бесконечный цикл. Завершиться может только с определенным условием, например, действием пользователя: программа
     * открыта, пока ее не закроет пользователь.
     * */
    public static void numbersWhile() {
        int a = 1;
        while (a < 11) {
            System.out.println(a);
            a++; // не забывать шаг
        }
    }

    /*
     * Выполнит цикл как минимум один раз, даже если условие не верно.
     * */
    public static void numbersDoWhile() {
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b < 11);
    }

    public static void isEqual(int a, int b) {
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public static int valueScanner(int value){
    return value;
    }



}