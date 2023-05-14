package Cars;

import java.sql.SQLOutput;

public class Nissan extends Car{
    public Nissan(String model) {
        super(model);
    }

    public Nissan(int speed) {
        super(speed);
    }
    @Override           // --> прописывали руками или система предлагала? Мне не предложила =\
    public void stop() {
        System.out.println("Without hesitation. Be careful when the road is slip");
    }
    @Override
    public void drive(){
        System.out.println(" ++ ");
    }
}
