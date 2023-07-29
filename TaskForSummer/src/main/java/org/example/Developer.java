package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Developer {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private char gender;
    private Car car;

    public Developer(String firstName, String lastName, int age, int salary, char gender, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public char getGender() {
        return gender;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return age == developer.age && gender == developer.gender && Objects.equals(firstName, developer.firstName) && Objects.equals(lastName, developer.lastName) && Objects.equals(salary, developer.salary) && Objects.equals(car, developer.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary, gender, car);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", car=" + car +
                '}';
    }
}
