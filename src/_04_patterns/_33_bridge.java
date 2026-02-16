package _04_patterns;

import java.util.Scanner;

public class _33_bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int u=1;u<=((2*n)-1);u++){
            System.out.print("*");
        }
        System.out.println();
        int nst=n-1;
        int nsp=1;
        for(int i=1;i<=(n-1);i++){
            for(int j=1;j<=nst;j++ ){
                System.out.print("*");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            nst--;
            nsp+=2;
        }
    }
}
