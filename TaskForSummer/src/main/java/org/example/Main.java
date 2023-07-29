package org.example;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        // —проходится по листу девелоперов и выводить всех мужчин у которых спортивная машина
        List<Developer> developerList1 = generator.generateDeveloper(2);
        developerList1.stream()
                        .filter(d -> d.getGender() == 'M' && d.getCar().isSport())
                        .forEach(System.out::println);
        // —группировать по полу все машины. те у мужчин такие то у женщин такие то
        List<Developer> developerList = generator.generateDeveloper(5);

        System.out.println(developerList.size() + ": " + developerList);

        List<Developer> manWithSportCars = developerList.stream()
                .filter(d -> d.getGender() == 'M')
                .filter(d -> d.getCar().isSport())
                .toList();

        System.out.println("1. " + manWithSportCars.size() + ": " + manWithSportCars);

        List<Car> mansCars = developerList.stream()
                .filter(d -> d.getGender() == 'M')
                .map(Developer::getCar)
                .toList();

        Map<Character, List<Car>> mMap = Map.of('M', mansCars);

        List<Car> femaleCars = developerList.stream()
                .filter(d -> d.getGender() == 'F')
                .map(Developer::getCar)
                .toList();

        Map<Character, List<Car>> fMap = Map.of('F', mansCars);

        System.out.println("Man with sport Cars " + mansCars.size() + ": " + mansCars);
        System.out.println("Woman with sport Cars " + femaleCars.size() + ": " + femaleCars);
        // —Переводить в мапу ключ-девелопер а значение максимальная скоросьть авто
        generator.changingToMap();
        generator.writeToFile();
    }

}