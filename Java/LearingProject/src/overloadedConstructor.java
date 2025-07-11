public class overloadedConstructor {
    
    String name;
    String email;
    int age;

    overloadedConstructor(String name){
        this.name = name;
        this.email = "Not provided";
        this.age = 0;
    }

    overloadedConstructor(String name , String email){
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    overloadedConstructor(String name , String email , int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

}
