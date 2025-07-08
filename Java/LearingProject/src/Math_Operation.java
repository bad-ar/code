import java.util.Scanner;

public class Math_Operation {
    public static void main(String[] args) {
        
        //Hypotenuse c = Math.sqrt(a^2 + b^2)

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A : ");
        a = input.nextDouble();

        System.out.print("Enter the length of side B : ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(b,2)+ Math.pow(a, 2));

        System.out.println("Hypotenuse: " + c);
        
        input.close();
    }

}