package _04_patterns;

import java.util.Scanner;

public class _31_pyramidM2 {
    public static void main(String[] args) {
        //   *
        //  ***
        // *****
        //*******
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //or we can say har line mein 2i-1 stars print horhe hai , therefore
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
