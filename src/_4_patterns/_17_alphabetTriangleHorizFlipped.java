package _4_patterns;

import java.util.Scanner;

public class _17_alphabetTriangleHorizFlipped {
    public static void main(String[] args) {
//        abcd
//        abc
//        ab
//        a
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();
        int a;
        for(int i=1;i<=n;i++){
            a=97;
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }
}