package _05_methods;

import java.util.Scanner;

public class _09_swapTwoNumbers1 {
    public static void main (String []args){
        //without a function two numbers can be swapped easily.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Before swapping : a = "+a+" , b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a = "+a+" , b = "+b);
    }
}
