// Object = An entity that holds data (attributes)
//          and cam perform actions (methods)

// import java.util.Random;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Random random = new Random();

        Car car = new Car();
        // access attributes
        car.isRunning = true;
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        System.out.println();

        Car car2 = new Car();
        car2.drive();
        car2.brake();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        input.close();
    }
}
