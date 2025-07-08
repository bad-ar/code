public class nestedIfElse {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student didcount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.9;
            }
            else{
                price *= 1;
            }
        }
        System.out.printf("The price of the ticket is $%.2f\n" , price);
        
    }
}
