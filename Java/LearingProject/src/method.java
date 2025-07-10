import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        
        // method = a block of reusable code

        Scanner input = new Scanner(System.in);

        String name;
        int age;

        Boolean f = true;
        int cnt = 0;
        while(f){
            if (cnt >= 1) {
                input.nextLine(); // Clear leftover newline
            }
            System.out.print("Do you want to wish anyone?yes/no: ");
            String temp = input.nextLine().toLowerCase();
            cnt++;
            if(temp.equals("yes")){
                System.out.print("Enter your name: ");
                name = input.nextLine();
                System.out.print("Enter your age: ");
                age = input.nextInt();
                happybirthday(name, age);
            }
            else{
                System.out.println();
                f = false;
            }
        }
        input.close();

    }

    static void happybirthday(String name , int age){
        System.out.println("Happy birthday to you!" );
        System.out.printf("Happy birthday dear %s!\n" , name);
        System.out.printf("You are %d years old!\n" , age);
        System.out.println("Happy birthday to you!\n");
    }
}
