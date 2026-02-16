package _3_loops;

import java.util.Scanner;

public class _15_printFactors {
    public static void main(String[] args) {
        //ques : take a number input and print all of its factors.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
