package _3_loops;

import java.util.Scanner;

public class _10_printWierdSequence {
    public static void main(String[] args) {
        //ques : Take 'n' as input from user and print the following sequence.
        // 1, n, 2, n-1, 3, n-2, 4, n-3...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a =1;
        int b =n;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a++;
            System.out.println(b);
            b--;
        }
    }
}
