package _4_patterns;

import java.util.Scanner;

public class _19_2alphabetTriangleHorizFlipped {
    public static void main(String[] args) {
//        AAAAA
//        BBBB
//        CCC
//        DD
//        E
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();
        int ch =65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)ch);
            }
            ch++;
            System.out.println();
        }
    }
}
