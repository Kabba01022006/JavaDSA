package _04_patterns;

import java.util.Scanner;

public class _05_alphabetSquare2Lower {
    public static void main(String[] args) {
        //ques :  abcde
//                abcde
//                abcde
//                abcde
//                abcde
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=97;
            for(int j=1;j<=n;j++){
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }
}
