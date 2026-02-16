package _3_loops;

import java.util.Scanner;

public class _19_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        int rem;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
