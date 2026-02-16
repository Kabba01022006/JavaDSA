package _3_loops;

import java.util.Scanner;

public class _21_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long n = sc.nextLong();
        long original=n;
        long fact =1;
        while(n>0){
            fact=fact*n;
            n=n-1;
        }
        if(original==0) System.out.println(1);
        else System.out.println(fact);
    }
}
// we may use long instead of int as in int it can only hold upto 12! not 13!