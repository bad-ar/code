public class Array2D {
    public static void main(String[] args) {
        
        // 2D array = an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Tesla";
        cars[0][2] = "Mustang";
        cars[1][0] = "Ranger";
        cars[1][1] = "Ferrari";
        cars[1][2] = "Camaro22";
        cars[2][0] = "Tesla22";
        cars[2][1] = "Ranger22";
        cars[2][2] = "Mustang33";

        for(int i = 0; i <cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();

        String[][] car = {
            {"Camaro" , "Tesla" , "Mustang"},
            {"ranger" , "Ferrari" , "camaro2"},
            {"Tesla342" , "mustang22" , "Bmw2" }
        };

        for(int i = 0; i <car.length; i++){
            System.out.println();
            for(int j = 0; j < car[i].length; j++){
                System.out.print(car[i][j] + " ");
            }
        }
        System.out.println();


    }
}
