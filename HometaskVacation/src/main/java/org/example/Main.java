package org.example;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.generateDeveloper(10);
        System.out.println("*".repeat(40));
        generator.groupCarsByGender();
        System.out.println("*".repeat(40));
        generator.changingToMap();
        System.out.println("*".repeat(40));
        generator.writeToFile("devs.txt");
    }
}