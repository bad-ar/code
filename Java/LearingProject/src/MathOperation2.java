import java.util.Scanner;

public class MathOperation2 {
    public static void main(String[] args) {
        
        // Circumference = 2 * Math.PI * radius;
        // Area = Math.PI * radius * radius
        // Volume = (4.0/3.0) * Math.PI * Math.pow(radius,3)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        double radius;
        double circumference; 
        double area;
        double volume;

        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("The area of the circle: " + area);
        System.out.println("The volume of the circle : " + volume);

        input.close();
    }
}
