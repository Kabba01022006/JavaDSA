package _4_patterns;

import java.util.Scanner;

public class _18_numberTriangleHorizFlipped {
    public static void main(String[] args) {
//        1234
//        123
//        12
//        1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
