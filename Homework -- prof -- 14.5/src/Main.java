import Cars.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan"){
            @Override
            public void stop(){
                System.out.println(getModel() + " with drift");
            }
        };
        car.drive();
        car.stop();
        car.safety();

        Car car2 = new Car("Tesla") {
            @Override
            public void stop() {
                System.out.println(getModel() + " stops calm and safely");
            }
        };
        car2.safety();
        car2.stop();
        car2.drive();

        Car car3 = new Car("Mazerratti") {
            @Override       // --> раз он все равно переопределяется, зачем в классе его переопределять? 2 раза override
            public void stop() {
                System.out.println(" stops really fast");
            }
        };
        car3.drive();
        car3.stop();
        car3.safety();
    }
}