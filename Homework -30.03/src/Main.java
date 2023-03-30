// 1) Создать( декларировать) все примитивные типы как глобальные переменные и как локальные переменные
import java.util.Scanner; // для второй задачи
public class Main {
    int a;
    float b;
    double c;
    char d;
    boolean e;
    byte f;
    short g;
    long l;

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");

    int x;
    float y;
    double z;
    char ch;
    boolean k;
    byte v;
    short w;
    long i;

//_____________________________________________________________________________
//Считать из консоли каждый примитивный тип и присвоить его переменной.

    System.out.println("Введите значение переменной х: ");
    int typeX = sc.nextInt();
    System.out.println("Значение переменной: " + typeX);

    System.out.println("Введите значение переменной y: ");
    Float typeY = sc.nextFloat();
    System.out.println("Значение переменной: " + typeY);

    System.out.println("Введите значение переменной z: ");
    double typeZ = sc.nextDouble();
    System.out.println("Значение переменной: " + typeZ);

    System.out.println("Введите значение переменной ch: ");
    String typeCH = sc.nextLine();
    System.out.println("Значение переменной: " + typeCH);

    System.out.println("Введите значение переменной k: ");
    boolean typeB = sc.nextBoolean();
    System.out.println("Значение переменной: " + typeB);

    System.out.println("Введите значение переменной v: ");
    byte typeBy = sc.nextByte();
    System.out.println("Значение переменной: " + typeBy);

    System.out.println("Введите значение переменной w: ");
    short typeSh = sc.nextShort();
    System.out.println("Значение переменной: " + typeSh);

    System.out.println("Введите значение переменной i: ");
    long typeL = sc.nextLong();
    System.out.println("Значение переменной: " + typeL);

    //_______________________________________________________________

// К сожалению тотально запуталась с 3 задачей - не понимаю, как передать тип переменной
        System.out.println("|----------|-----------|");
        System.out.println("|----Тип---|--Значение-|");
        System.out.printf("|int %10s| %10d|\n", typeX); // %s - хотим вывести строку, %f - для числа с плавающей точкой,
        System.out.printf("|float %5s| |%10f|\n", typeY);
        // %d - вывесли целое число //%20s выделяет на имя заданное кол-во символов
        //%5.2f - позволяет округлить дробные части до 2 знаков
        System.out.println("|----------|-----------|");




    }
}
