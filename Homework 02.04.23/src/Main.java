public class Main {
    //Задача 1. Создать класс Car c приватными полями, двумя конструкторами, aксессорами
    // для полей и методом(процедурой) out для вывода всех полей класс на консоль
    public static void main(String[] args) {
    System.out.println("");

    Car car = new Car("Nissan", 2022, "Black", 50000, 300, false);
    Car car2 = new Car("Lexus", 2015, "White", 70000, 500, true);

    System.out.println(car.getColor());
    car.setPrice(40000);

    car.out();
    car2.out();

    // Задача 2. Создать статические(static) методы для решения основных арифметических
    //операций: +, -, *, /


        //Переменные к задаче 2
        int a = 12; // ШАГ 2 --> инициализация переменных
        int b = 15;
        int c = 56;
        int d = 34;
        int e = 62;
        int f = 123;
        int g = 600;
        int h = 3;

        //Вызов результатов метода к задаче 2
        System.out.println(sum(a,b)); // ШАГ 3 --> вызов результата метода
        System.out.println(min(c,d));
        System.out.println(mul(e,f));
        System.out.println(div(g,h));

        //_______________________________________________
        // Задача 3. Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
        //a) первая переменная больше двух остальных;
        //b) первая переменная больше хотя бы одной переменной;
        //c) первая переменная больше только одной переменной.

        //_______________________________________
        //Переменные к задаче 3
        int z = 17;
        int x = 23;
        int y = 45;
        int w = 63;

        System.out.println(z > x && z > y);
        System.out.println(z > x || z > y);
        System.out.println(z > x ^ z > y);

    }
    public static int sum(int a, int b){  // ШАГ 1 --> создание метода
        return a + b;  // --> на повторное использование таких переменных не ругается из-за статика?
    }
    public static int min(int c, int d){
        return c - d;
    }
    public static int mul(int e, int f){
        return e * f;
    }
    public static int div(int g, int h){
        return g / h;
    }

    // Задача 3
    public static boolean isMoreThanTwo(int z, int x, int y){
        return (z > x && z > y);
    }

    public static boolean isMoreAtLeastOne(int z, int x, int y){
        return(z > x || z > y);
    }

    public static boolean isMoreThanOne(int z, int x, int y){
        return(z > x ^ z > y);
    }



}