import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        
        // Compund interest

        Scanner input = new Scanner(System.in);

        double principle;
        double rate;
        int years;
        int timesCompounded;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = input.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = input.nextDouble() / 100;
        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = input.nextInt();
        System.out.print("Enter the # of the years: ");
        years = input.nextInt();

        amount = principle* Math.pow(1+ (rate / timesCompounded),years);

        System.out.printf("The amount after %d years is $%.2f " , years ,amount);
        input.close();
    }
}
