package _4_patterns;

import java.util.Scanner;

public class _15_flippedTriangleHorizontally {
    public static void main(String[] args) {
//        ****
//        ***
//        **
//        *
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // i + jmax = n + 1   always
        // so jmax = n + 1 - i
        // means j will always go from j = 1 to n+1-i
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//
