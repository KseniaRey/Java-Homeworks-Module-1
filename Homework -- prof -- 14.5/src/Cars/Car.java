package Cars;

public abstract class Car implements DrivePossibility{
    private String model;
    private int speed;

    public Car(int speed){
        this.speed = speed;
    }
    public Car(String model){
        this.model = model;
    }
    public void drive(){
        System.out.println(model + " is driving");
    }
    public abstract void stop();
    public void safety(){
        System.out.println(model + " is pretty safe for humans and animals");
    }

    public String getModel() {
        return model;
    }
}
