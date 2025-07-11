// import java.util.Scanner;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
   
    // Scanner input = new Scanner(System.in);
    
    public Student(String a , int b , double c , boolean d){
        this.name = a;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = d;
    }
    // void readData(){
    //     System.out.print("Enter student name: ");
    //     name = input.nextLine();
    //     System.out.print("Enter student age: ");
    //     age = input.nextInt();
    //     System.out.print("Enter student gpa: ");
    //     gpa = input.nextDouble();
    //     System.out.print("Student is enrolled?true/false: ");
    //     isEnrolled = input.nextBoolean();
    // }
    void displayData(){
        System.out.println("Student name is " + name);
        System.out.println("He is " + age + " years old");
        System.out.println("His gpa is " + gpa);
        if (isEnrolled) {
            System.out.println("He is enrolled.");
        }
        else{
            System.out.println("He is not enrolled.");
        }

    }

}
