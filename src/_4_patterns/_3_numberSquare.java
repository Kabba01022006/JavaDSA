package _4_patterns;

import java.util.Scanner;

public class _3_numberSquare {
    public static void main(String[] args) {
//        ques : 1234
//               1234
//               1234
//               1234
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
