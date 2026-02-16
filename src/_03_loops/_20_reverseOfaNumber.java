package _03_loops;

import java.util.Scanner;

public class _20_reverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int rev=0;
        int rem;
        while(n!=0){
            rem = n%10;
            rev = rem + rev*10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
