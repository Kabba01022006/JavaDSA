package _04_patterns;

import java.util.Scanner;

public class _13_alphabetTriangle2 {
    public static void main(String[] args) {
        //A
        //BB
        //CCC
        //DDDD
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int a=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)a);
            }
            a++;
            System.out.println();
        }
    }
}
