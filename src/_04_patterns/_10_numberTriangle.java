package _04_patterns;

import java.util.Scanner;

public class _10_numberTriangle {
    public static void main(String[] args) {
        //1
        //12
        //123
        //1234
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
