package Java;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your name is " + name + " & You are " + age + " years old.");
        input.close();
    }
}
