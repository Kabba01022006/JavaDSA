package _3_loops;

import java.util.Scanner;

public class _9_1printGP_uptoNnumberOfTerms {
    public static void main(String[] args) {
        //ques : Display this GP : 1,2,4,8... upto 'n' terms.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*2;
        }
    }
}
