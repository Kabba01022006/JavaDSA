package _04_patterns;

import java.util.Scanner;

public class _02_square {
    public static void main(String[] args) {
//        Ques : ****
//               ****
//               ****
//               ****
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
