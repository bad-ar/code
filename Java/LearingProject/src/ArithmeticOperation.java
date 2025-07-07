import java.util.Scanner;

public class ArithmeticOperation {
    public static float add (float a , float b){
        return  (a+b);
    }
    public static float subtraction (float a , float b){
        return a-b;
    }
    public static float multiply(float a , float b) {
        return a*b;
    }
    public static float division (float a , float b) {
        return a/b;
    }
    public static void main(String[] args) {

        //Arithmetic Operation
        Scanner input = new Scanner(System.in);
        float num1 , num2;
        System.out.print("Enter the first number: ");
        num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = input.nextFloat();

        System.out.println("The addition of " + num1 + " & " + num2 + " is " + add(num1, num2));
        System.out.println("The subtraction of " + num1 + " & " + num2 + " is " + subtraction(num1, num2));
        System.out.println("The multiplication of " + num1 + " & " + num2 + " is " + multiply(num1, num2));

        if(num2==0){
            System.out.println("No number is divisible by zero.");
        }
        else{
            System.out.println("The division of " + num1 + " & " + num2 + " is " + division(num1, num2));
        }


        input.close();
    }
}
