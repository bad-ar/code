public class ternaryOperator {

    public static void main(String[] args) {
        // Ternary operator
        int number = 3;
        String get;
        get = (number % 2 == 0)?"even":"odd";
        System.out.println(get);

        int hours = 13;
        String timeOfDay = (hours < 12)? "A.M" : "P.M";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000)?0.25:0.15;
        System.out.println(taxRate);
    }
}