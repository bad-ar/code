public class string {
    public static void main(String[] args) {

        String name = "Bro Code";
         int length = name.length();
        System.out.println("The length of the string is " + length);

        int letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf('o');
        
        System.out.println(index);

        name = name.toLowerCase();
        System.out.println("lowercase: " + name);

        name = name.toUpperCase();
        System.out.println("Uppercase: " + name);

        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }
        else{
            System.out.println("Hello " + name);
        }


        String name2 = "Python";
        name = "cpp";

        if(name.equals(name2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal.");
        }
    }
}
