public class Car {
    //Задача 1. Создать класс Car c приватными полями, двумя конструкторами,
    // aксессорами для полей и методом(процедурой) out для вывода всех полей класс на консоль
    private String brand;
    private int year;
    private String color;
    private double price;
    private int power;
    boolean Manual;

    public Car(String brand, int year, String color, double price, int power){
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.power = power;
    }

    public Car(String brand, int year, String color, double price, int power, boolean manual) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.power = power;
        Manual = manual; // --> почему без this?
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public boolean isManual() {
        return Manual;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setManual(boolean manual) {
        Manual = manual;
    }

    public void out(){
        System.out.println("Brand: " + brand + "\n" + "Year: " + year + "\n" +
                "Color: " + color + "\n" +
                "Price: " + price + "\n" +
                "Power: " + power + "\n" +
                "Mechanical Transmission: " + Manual);

        //_________________________________________________________

    }
}


