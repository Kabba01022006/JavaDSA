package _02_ifElse;

import java.util.Scanner;

public class _01_oddEven {
    public static void main(String[] args) {
        //Ques : Take positive integer input and tell if it is odd or even.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else if (n%2!=0){
            System.out.println("Odd");
        }
    }
}
