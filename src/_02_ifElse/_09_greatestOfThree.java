package _02_ifElse;

import java.util.Scanner;

public class _09_greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greatest.");
        }
        else if(b>a && b>c){
            System.out.println("b is greatest.");
        }
        else if(c>a && c>b){
            System.out.println("c is greatest.");
        }
        else{
            System.out.println("All three are equal.");
        }
    }
}
