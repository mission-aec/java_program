
import java.util.*;

class vechicle {

    public void start() {
        //System.out.println("Start engine");
    }

    public void stop() {
        //System.out.println("Stop engine");
    }

    public void model(String model) {
        System.out.println("Model: " + model);
    }

}

class car extends vechicle {

    @Override
    public void start() {
        System.out.println("car engine start");
    }

    @Override
    public void stop() {
        System.out.println("car engine stop");
    }
}

class bike extends vechicle {

    @Override
    public void start() {
        System.out.println("bike engine start");
    }

    @Override
    public void stop() {
        System.out.println("bike engine stop");
    }
}

public class inheritance {

    public static void main(String[] args) {
        vechicle vechicle = new vechicle();
        car car = new car();
        bike bike = new bike();

        Scanner input = new Scanner(System.in);
        System.out.println("Input car model: ");
        String carmodel = input.nextLine();
        System.out.println("Input bike model: ");
        String bikemodel = input.nextLine();

        car.model(carmodel);
        car.start();
        car.stop();

        bike.model(bikemodel);
        bike.start();
        bike.stop();
    }
}
