public class overloadedConstructorMain {
    public static void main(String[] args) {
        
        // overloaded constructors = Allow a class to have multiple constructor
        //     with different parameters lists
        //     Enable objects to be initialized in various ways.

       overloadedConstructor user1 = new overloadedConstructor("Kamal");
       overloadedConstructor user2 = new overloadedConstructor("Jamal" , "jamal@gmail.com");
       overloadedConstructor user3 = new overloadedConstructor("Badar" , "Badar@gmail.com" ,22 );

       System.out.println(user1.name);
       System.out.println(user1.email);
       System.out.println(user1.age);

       System.out.println(user2.name);
       System.out.println(user2.email);
       System.out.println(user2.age);

       System.out.println(user3.name);
       System.out.println(user3.email);
       System.out.println(user3.age);
    }
}
