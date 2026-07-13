package _05_methods;

public class _07_returnType {
    public static int greeting(){
        System.out.println("hey");
        System.out.println("hello");
        return 5;           // return basically means khatam
    }
    public static void main(String[] args) {
        System.out.println(greeting());

        //or
        // int x = greeting();
        //System.out.println(greeting());
    }
}
