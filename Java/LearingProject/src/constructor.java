// import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {

        // Constructor = A special method to initialize objects
        // you can pass arguments to a constructor
        // and set up initial values

        // Scanner input = new Scanner(System.in);

        // String name;
        // int age;
        // double gpa;
        // boolean isEnrolled;


        // System.out.print("Enter student name: ");
        // name = input.nextLine();
        // System.out.print("Enter student age: ");
        // age = input.nextInt();
        // System.out.print("Enter student gpa: ");
        // gpa = input.nextDouble();
        // System.out.print("Student is enrolled?true/false: ");
        // isEnrolled = input.nextBoolean();

        Student student1 = new Student("Badar" , 21 , 4.6 , true);

        student1.displayData();

        // input.close();

    }
}
