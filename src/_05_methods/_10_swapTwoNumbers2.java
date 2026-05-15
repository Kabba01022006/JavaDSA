package _05_methods;

import java.util.Scanner;

public class _10_swapTwoNumbers2 {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        //but with a function, as there are no pointers in java, we cannot swap two numbers normally

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Before swapping : a = "+a+" , b = "+b);
        swap(a,b);
        System.out.println("After swapping : a = "+a+" , b = "+b);
    }
    // no swapping observed
}
