package _1_basics;

public class _11_1charAndASCII {
    public static void main(String[] args) {
        char first = 'a';
        System.out.println(first);
        int x = first; //this is typecasting , we typecasted the charachter a to its integer value which basically gives us its ASCII value.This we did was implicit type casting.
        System.out.println(x);
        char second = 'b';
        System.out.println(second);
        int y = (int)second;// this is explicit type casting . Altough in this case , it is redundant (meaning there is no need to do it explicitally , it can be implicitally done).
        System.out.println(y);
        //ASCII value of a = 97, b = 98 .....
        //ASCII value of A = 65 ,B = 66 .....
        //ASCII value of 0 = 48 , 1 = 49 , ...

    }
}
