package _3_loops;

import java.util.Scanner;

public class _14_primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<=n-1;i++){ //use for(int i=2;i<=Math.sqrt(n);i++) for better time complexity.(understand this thing online ,why?)
            if(n%i==0){
                flag = false; // false mean composite.
                break;
            }
        }
        if(n==0) System.out.println("neither prime nor composite.");
        else if(n==1) System.out.println("neither prime nor composite.");
        else if(flag==true) System.out.println("prime");
        else if(flag==false) System.out.println("not prime(composite)");
    }
}
