package _3_loops;

import java.util.Scanner;

public class _18_countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int digits = 0;
        if(n==0) digits=1;//as zero is a 1 digit number.(edge case)
        while(n!=0){
            n=n/10;
            digits+=1;
        }
        System.out.println(digits);

    }
}
