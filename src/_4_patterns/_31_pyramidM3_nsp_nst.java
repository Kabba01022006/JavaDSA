package _4_patterns;

import java.util.Scanner;

public class _31_pyramidM3_nsp_nst {
    public static void main(String[] args) {
        //   *
        //  ***
        // *****
        //*******
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
