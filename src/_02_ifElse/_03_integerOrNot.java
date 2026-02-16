package _02_ifElse;

import java.util.Scanner;

public class _03_integerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int duplicate = (int)n;
        double diff = n - duplicate;
        if(diff==0){
            System.out.println("It was an integer.");
        }
        else{
            System.out.println("It wasn't an integer.");
        }
    }
}
