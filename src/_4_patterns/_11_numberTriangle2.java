package _4_patterns;

import java.util.Scanner;

public class _11_numberTriangle2 {
    public static void main(String[] args) {
        //1
        //22
        //333
        //4444
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
