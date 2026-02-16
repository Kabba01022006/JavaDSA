package _05_methods;

import java.util.Scanner;

public class _02_findMaxof4Numbers {
    public static void main(String[] args) {
        //ques : Take fours numbers input and tell which is the max of them.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.print("Enter third number : ");
        int c=sc.nextInt();
        System.out.print("Enter fourth number : ");
        int d=sc.nextInt();
        System.out.println("Greatest number is : "+(Math.max(Math.max(a,b),Math.max(c,d))));
    }
}

//
