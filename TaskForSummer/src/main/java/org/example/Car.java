package org.example;

import java.util.Objects;

public class Car {
    private String color;
    private boolean isSport;
    private CarBrand carBrand;
    private int maxSpeed;

    public Car(String color, boolean isSport, CarBrand carBrand, int maxSpeed) {
        this.color = color;
        this.isSport = isSport;
        this.carBrand = carBrand;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public boolean isSport() {
        return isSport;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isSport == car.isSport && maxSpeed == car.maxSpeed && Objects.equals(color, car.color) && carBrand == car.carBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isSport, carBrand, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", isSport=" + isSport +
                ", carBrand=" + carBrand +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
