import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {

        // Temperature conversion
        Scanner input = new Scanner(System.in);
        Boolean f = true;
        while(f){
            System.out.println("1. Celcius to farenheit conversion.");
            System.out.println("2. Farenheit to celcius conversion.");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            double farenheit;
            double celcius;
            switch (choice) {
                case 1:
                    System.out.print("Enter celcius: ");
                    celcius = input.nextInt();
                    farenheit = 32 + ((9/5)*celcius);
                    System.out.println("Celcius to farenheit: " + farenheit);
                    break;
                case 2:
                    System.out.print("Enter farenhiet: ");
                    farenheit = input.nextInt();
                    celcius = 5*(farenheit - 32 )/9;
                    System.out.println("Farenheit to celcius: " + celcius);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    f = false;
                    break;
                default:
                    System.out.println("Please,choose a correct one");
                    break;
            }

        }
        input.close();
    }
}
