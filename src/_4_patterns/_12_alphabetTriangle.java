package _4_patterns;

import java.util.Scanner;

public class _12_alphabetTriangle {
    public static void main(String[] args) {
        //A
        //AB
        //ABC
        //ABCD
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int a;
        for (int i=1; i<=n; i++) {
            a=65;
            for (int j=1; j<=i; j++) {
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }
}
