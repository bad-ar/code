import java.util.Scanner;

public class subString {
    public static void main(String[] args) {

        // play with substring
        
        Scanner input = new Scanner(System.in);
        String email;
        System.out.print("Enter your email: ");
        email = input.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);

        input.close();
    }
}
