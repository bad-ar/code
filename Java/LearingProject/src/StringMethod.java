public class StringMethod {
    public static void main(String[] args) {
        
        String name = "Bro Code";
        boolean result = name.equals("bro code");
        System.out.println(result);

        System.out.println("length: " + name.length());
        System.out.println("Char at index-2: " + name.charAt(2));
        System.out.println("Index of char 'o': " + name.indexOf('o'));
        System.out.println("Empty string check: " + name.isEmpty());
        System.out.println(name.toLowerCase());
    }
}
