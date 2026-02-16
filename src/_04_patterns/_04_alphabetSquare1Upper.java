package _04_patterns;

import java.util.Scanner;

public class _04_alphabetSquare1Upper {
    public static void main(String[] args) {
//        ques :  ABCDE
//                ABCDE
//                ABCDE
//                ABCDE
//                ABCDE
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=65;
            for(int j=1;j<=n;j++){
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }
}
