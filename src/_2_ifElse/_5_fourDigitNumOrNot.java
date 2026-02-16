package _2_ifElse;

import java.util.Scanner;

public class _5_fourDigitNumOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("Its a four digit number.");
        }
        else{
            System.out.println("Its not a four digit number.");
        }
    }
}
