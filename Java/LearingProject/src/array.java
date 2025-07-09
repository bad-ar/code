public class array {
    public static void main(String[] args) {
        
        // array = used to store multiple values in a single variable

        String[] cars = {"BMW" , "tesla" , "Camaro"};

        cars[1] = "Mustang";

        System.out.println(cars[0]);
        System.out.println(cars[1]);

        String[] car = new String[3];
        car[0] = "Camaro";
        car[1] = "Tesla";
        car[2] = "BMW";
        for(int i = 0; i <car.length; i++){
            System.out.println(car[i]);
        }
    }
}
