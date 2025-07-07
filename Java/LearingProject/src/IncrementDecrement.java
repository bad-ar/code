import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment & decrement 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a,b;
        a = input.nextInt();
        System.out.print("Enter a number: ");
        b = input.nextInt();

        System.out.println("a=" + a);
        a = a++;
        System.out.println("a (a++) = " + a);
        a = ++a;
        System.out.println("a (++a) = " + a);

        System.out.println("b = " + b);
        b = b--;
        System.out.println("b(b--) = " + b);
        b = --b;
        System.out.println("b(--b) = " + b);
        input.close();
    }
}
