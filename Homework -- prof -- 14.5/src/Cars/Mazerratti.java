package Cars;

public class Mazerratti extends Car {
    public Mazerratti(String model) {
        super(model);
    }

    @Override
    public void stop() {
        System.out.println(" stops really fast");
    }
}
