import java.util.Random;
import java.util.Scanner;

public class numberGuesingGame {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int lowerbound,upperbound;
        System.out.print("Enter a number(lowerbound): ");
        lowerbound = input.nextInt();
        System.out.print("Enter a number(upperbound): ");
        upperbound = input.nextInt();

        Random random = new Random();
        int randomnumber = random.nextInt(lowerbound,upperbound);
        int attempts = 0;
        int success = 0;
        Boolean f = true;
        while(f){
            System.out.print("Guess the number between "+ lowerbound + "-" + upperbound + ": ");
            int guess = input.nextInt();
            
            attempts++;
            String temp ;

            if(guess == randomnumber){
                success++;
                System.out.println("You have guessed the correct number.");
                System.out.print("Do you want to play again?yes/no: ");
                input.nextLine(); // clear buffer
                temp = input.nextLine();

                if (temp.equals("yes")) {
                    System.out.print("Enter a number(lowerbound: ");
                    lowerbound = input.nextInt();
                    System.out.print("Enter a number(upperbound): ");
                    upperbound = input.nextInt();
                }
                else{
                    System.out.printf("\nYou have succeeded %d times out of %d game.\n" , success , attempts);
                    double percentage =( double)success/attempts;
                    System.out.println("Your winning percentage is "+ percentage*100 + "%");
                    f = false;
                    break;
                }
            }
            else if (guess > randomnumber  && guess <= upperbound){
                System.out.println("Too high.Try again.");
            }
            else if (guess < randomnumber && guess >= lowerbound){
                System.out.println("Too low.Try again.");
            }
            else{
                System.out.println("Please type between " + lowerbound + "-" + upperbound);
            }
        }
        input.close();
    }
}
