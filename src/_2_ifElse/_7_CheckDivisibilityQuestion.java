package _2_ifElse;

import java.util.Scanner;

public class _7_CheckDivisibilityQuestion {
    public static void main(String[] args) {
        //Ques : Print "divisible by 5 if the number is divisible by 5.
        //Ques : Print "divisible by 3 if the number is divisible by 3.
        //Ques : Print "divisible by 3 or 5 if the number is divisible by 3 or 5.
        //Ques : Print "not divisible by 3 or 5 if the number is not divisible by anyone 3 or 5.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("divisible by 3 and 5");
        }
        else if(n%5==0){
            System.out.println("divisible by 5");
        }
        else if(n%3==0){
            System.out.println("divisible by 3");
        }
        else{
            System.out.println("not divisible by anyone 3 or 5");
        }
    }
}
