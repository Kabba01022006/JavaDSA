package _4_patterns;

import java.util.Scanner;

public class _30_doubleFlippedTriangle {
    public static void main(String[] args) {
        //   *
//          **
//         ***
//        ****
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for (int k=1;k<=n+1-i;k++){ //we can here use j as a variable too but using k just in case for convenience and clarity .
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
