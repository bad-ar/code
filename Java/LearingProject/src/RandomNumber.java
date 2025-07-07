import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {

        //Random number
        Random random = new Random();

        double number;
        number = random.nextDouble();
        System.out.println("Random number is " + number);

        boolean isHeads;
        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }


    }
}
