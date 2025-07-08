import java.util.Scanner;

public class condition {
    public static void main(String[] args) {

        // if-clse

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age>18) {
            System.out.println("You are an adult!");
        }
        else if (age < 0){
            System.out.println("You are not born yet!");
        }
        else if (age ==0 ) {
            System.out.println("You have just born.You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }
        input.close();
    }
}
