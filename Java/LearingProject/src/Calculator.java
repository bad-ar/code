import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {

    // Build a calculator

    Scanner  input = new Scanner(System.in);
    Boolean f = true;

    System.out.print("Enter first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter first number: ");
    double num2 = input.nextDouble();

    int operation = 0;
    while(f){

        System.out.println("Select an operation.");
        System.out.println("1. addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
        System.out.print("Enter your choice: ");
        int choice;
        choice = input.nextInt();

        operation++;
        switch (choice) {
            case 1:
                System.out.println("The addition of " + num1 + " & " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The subtraction of " + num1 + " & " + num2 + " is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The multiplication of " + num1 + " & " + num2 + " is " + (num1 * num2));
                break;
            case 4:
                if(num2 == 0 ){
                    System.out.println("No number is divisible by zero.");
                    
                }
                else{
                    System.out.println("The division of " + num1 + " & " + num2 + " is " + (num1 / num2));
                }
                break;
            case 5:
                System.out.println(operation + " operations completed.");
                System.out.println("Exiting...");
                f = false;
                break;
            default:
                System.out.println("Please select a correct choice.");
                break;
        }

    }
      input.close();
   } 
}
