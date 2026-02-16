package _04_patterns;

import java.util.Scanner;

public class _25_oddNumberTriangle {
    public static void main(String[] args) {
//        1
//        13
//        135
//        1357
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a=a+2;
            }
            System.out.println();
        }
    }
}
