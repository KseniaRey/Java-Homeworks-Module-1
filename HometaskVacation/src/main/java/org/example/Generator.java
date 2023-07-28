package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    /*
    * Написать класс машина у которой будут поля цвет, булеан-спортивная или нет, энам марка и инт максимальная скорость
Написать класс Девелопер у которого будет имя, фамилия , возраст, зарплата, чар- пол и машина
Написать класс Генератор которые генерирует Девелоперов и Машины
у генератора будут два метода которые будут генерировать машины и девелоперов в зависимости от количества которые вы передадите в параметры
Вам в помощ библиотека faker для генерации любых имен, фамилий итд
Написать класс Обработчик который будет:
—проходится по листу девелоперов и выводить всех мужчин у которых спортивная машина
—группировать по полу все машины. те у мужчин такие то у женщин такие то
—Переводить в мапу ключ-девелопер а значение максимальная скоросьть авто
—записывать в текстовый файл всех девелоперов в формате : Jonn-[auto: BMW ::: salary: 12345] в столбик. Т.е в файле нужна только эта инфа
    * */
    final Faker faker = new Faker(); // создаем объект библиотеки факер ддля генерации рандомных значений
    List<Developer> developerList = new ArrayList<>(); // создаем в классе лист девелоперов

    public List<Developer> generateDeveloper(int amount){ // метод для генерации девелоперов

//        for (Developer developer : developerList) {
//            developerList.add(new Developer(faker.name().firstName(), faker.name().lastName(),
//                    faker.number().numberBetween(20, 60),
//                    faker.number().numberBetween(10000, 1000000),
//                    faker.bool().bool() ? 'M' : 'F',
//                    generateCar()));
//        }
//        return developerList;
        for (int i = 0; i < amount; i++) { // цикл фор для генерации каждого девелопера
        developerList.add(new Developer(faker.name().firstName(), faker.name().lastName(), // создание анонимного объекта класса девелопер, добавление его в лист и присваивание ему автоматически сгенерированных характеристик (имя, зп и так далее)
                faker.number().numberBetween(20, 60),
                faker.number().numberBetween(10000, 1000000),
                faker.bool().bool() ? 'M' : 'F', // faker.bool().bool() -> матрешка, первый вернет объект, второй - его метод, который вернет логическое значение
                // if(bool().bool()){developer.setGender('M')} else {developer.setGender('F')}
                generateCar() // вызов метода генерации машин, чтобы у каждого девелопера была своя машина
                ));
            System.out.println(developerList.get(i).toString()); // получение каждого девелопера и преобразование рез-та в стрингу
        }
        return developerList; // возвращаем лист созданных девелоперов
    }

    private Car generateCar() { // генерируем машину для девелопера
        CarBrand carBrand = CarBrand.MASERATI; // создаем переменную енамовского класса и инициализируем ее значением
        int count = faker.number().numberBetween(1, 5); // добавляем счетчик, используя библиотеку и задаем ему величину от 1 до 5
        switch (count){ // конечный автомат
            case 1: // описываем случаи
                carBrand = CarBrand.MASERATI; // если будет 1, выведется мазерати
                break; // чтобы не отработали все кейсы
            case 2: // описываем случаи
                carBrand = CarBrand.AUDI; // если будет 2, выведется ауди
                break; // чтобы не отработали все кейсы
            case 3: // описываем случаи
                carBrand = CarBrand.LEXUS; // если будет 3, выведется лексус
                break; // чтобы не отработали все кейсы
            case 4:// описываем случаи
                carBrand = CarBrand.LAMBORGHINI; // если будет 4, выведется ламборджини
                break; // чтобы не отработали все кейсы
            case 5:// описываем случаи
                carBrand = CarBrand.NISSAN; // если будет 5, выведется Ниссан
                break; // чтобы не отработали все кейсы
        }
        Car car = new Car(faker.color().name(), faker.bool().bool(), carBrand, faker.number().numberBetween(180, 250)); // создаем новый объект Car и с помощью библиотеки присваиваем ему значения
        return car; // возвращаем созданный объект с прописанными значениями
        }


}
