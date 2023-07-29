package org.example;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Generator {

    /*
Написать класс машина у которой будут поля цвет, булеан-спортивная или нет, энам марка и инт максимальная скорость
Написать класс Девелопер у которого будет имя, фамилия , возраст, зарплата, чар- пол и машина
Написать класс Генератор которые генерирует Девелоперов и Машины
у генератора будут два метода которые будут генерировать машины и девелоперов в зависимости от количества которые вы передадите в параметры
Вам в помощ библиотека faker для генерации любых имен, фамилий итд
Написать класс Обработчик который будет:
—проходится по листу девелоперов и выводить всех мужчин у которых спортивная машина ---
—группировать по полу все машины. те у мужчин такие то у женщин такие то ---
—Переводить в мапу ключ-девелопер а значение максимальная скоросьть авто ---
—записывать в текстовый файл всех девелоперов в формате : Jonn-[auto: BMW ::: salary: 12345] в столбик. Т.е в файле нужна только эта инфа
    * */
    final Faker faker = new Faker(); // создаем объект библиотеки факер ддля генерации рандомных значений
    List<Developer> developerList = new ArrayList<>();


    public List<Developer> generateDeveloper(int amount) {

        for (int i = 0; i < amount; i++) {
            developerList.add(new Developer(faker.name().firstName(), faker.name().lastName(),
                    faker.number().numberBetween(20, 60),
                    faker.number().numberBetween(10000, 1000000),
                    faker.bool().bool() ? 'M' : 'F',

                    generateCar()
            ));
            System.out.println(developerList.get(i).toString());
        }
        return developerList;
    }

    private CarBrand defineCarBrand(int num) {
        CarBrand carBrand = null;
        switch (num) {
            case 1 ->
                    carBrand = CarBrand.MASERATI;

            case 2 ->
                    carBrand = CarBrand.AUDI;

            case 3 ->
                    carBrand = CarBrand.LEXUS;

            case 4 ->
                    carBrand = CarBrand.LAMBORGHINI;

            case 5 ->
                    carBrand = CarBrand.NISSAN;
        }
        return carBrand ;
    }

        public Car generateCar () {
            CarBrand carBrand = defineCarBrand(faker.number().numberBetween(1, 5));
            return new Car(faker.color().name(), faker.bool().bool(), carBrand, faker.number().numberBetween(180, 250));
        }


        public Map<Character, List<Car>> groupCarsByGender () {
            Map<Character, List<Car>> carMap = new HashMap<>();

            for (Developer developer : developerList) {
                char gender = developer.getGender();
                Car car = generateCar();
                if (carMap.containsKey(gender)) {
                    carMap.get(gender).add(car);
                } else {
                    List<Car> cars = new ArrayList<>();
                    cars.add(car);
                    carMap.put(gender, cars);
                }
            }

            for (Map.Entry<Character, List<Car>> entry : carMap.entrySet()) {
                char gender = entry.getKey();
                List<Car> cars = entry.getValue();

                if (gender == 'M') {
                    System.out.println("Male developers are having:");
                } else {
                    System.out.println("Female developers are having:");
                }

                for (Car car : cars) {
                    System.out.println(car);
                }
            }

            return carMap;
        }

// —Переводить в мапу ключ-девелопер а значение максимальная скоросьть авто
        public Map<String, Integer> changingToMap () {
            Map<String, Integer> map = new HashMap<>();
            for (Developer developer : developerList) {
                map.put(developer.getFirstName(), developer.getCar().getMaxSpeed());
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            }
            return map;
        }

// —записывать в текстовый файл всех девелоперов в формате : Jonn-[auto: BMW ::: salary: 12345] в столбик. Т.е в файле нужна только эта инфа
        public void writeToFile () {
            try (FileWriter fileWriter = new FileWriter("src/main/resources/result.txt")) {
                for (Developer dev : developerList) {
                    fileWriter.write(dev.getFirstName() + " -[auto: " + dev.getCar().getCarBrand() + " ::: salary: " + dev.getSalary() + "]" +  "\n");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            ;
        }



    }

