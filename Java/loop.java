package Java;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt(); //Reads an integer 

        for (int i = 1; i <= number; i++) {
            System.out.println("Number: " + i); // Prints numbers from 1 to the input number
        }
        input.close();
        System.out.println("Loop completed.");
    }
}
