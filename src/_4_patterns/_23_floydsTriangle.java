package _4_patterns;

import java.util.Scanner;

public class _23_floydsTriangle {
    public static void main(String[] args) {
//        1
//        23
//        456
//        78910
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
