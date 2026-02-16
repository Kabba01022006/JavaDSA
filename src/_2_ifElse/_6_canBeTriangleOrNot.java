package _2_ifElse;

import java.util.Scanner;

public class _6_canBeTriangleOrNot {
    public static void main(String[] args) {
        //Question : Take 3 positive integers input and tell if they can be sides of a triangle or not.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b > c && a+c>b && b+c>a){
            System.out.println("It is a triangle.");
        }
        else{
            System.out.println("It is not a triangle.");
        }
    }
}
