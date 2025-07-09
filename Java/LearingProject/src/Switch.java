public class Switch {
    public static void main(String[] args) {
        
        // Switch  = statement that allows a variable to be tested for equality against a list of value

        String day = "friday";

        switch (day) {
            case "sunday":
                System.out.println("It is Sunday");
                break;
            case "saturdayday":
                System.out.println("It is Saturday");
                break;
            case "monday":
                System.out.println("It is Monday");
                break;
            case "thuesday":
                System.out.println("It is Thuesday");
                break;
            case "wednesdayday":
                System.out.println("It is Wednesday");
                break;
            case "thursday":
                System.out.println("It is Thursday");
                break;
            case "friday":
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("It is not a day");
                break;
        }
    }
}
