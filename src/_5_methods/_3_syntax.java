package _5_methods;
// main method is a function which always runs
// rest other methods run or not depends if they were calle in main function or not.
public class _3_syntax {

    public static void main(String[] args) {
        greeting(); //calling greeting method
        System.out.println("Shobhit");
    }
    public static void greeting() {
        System.out.println("Hello");
    }
}
//unlike C , other methods can here be placed above or below the main method , the order doesn't matter as during compilation , the java compiler looks at the entire class before it starts translating the code.
