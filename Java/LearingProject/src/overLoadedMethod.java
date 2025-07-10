public class overLoadedMethod {
    public static void main(String[] args) {
        
        add(2,3, 0);
        add(2,5,6, 0);
        add(2,9,5,3);

    }
    static void add(int a , int b){
        System.out.println(a+b);
    }
    static void add(int a , int b , int c){
        System.out.println(a+b+c);
    }
    static void add(int a , int b , int c , int d){
        System.out.println(a+b+c+d);
    }
}
