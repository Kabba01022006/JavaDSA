package _4_patterns;
import java.util.Scanner;

public class _7_alphabetSquare3 {
    public static void main(String[] args) {
//      ques :  AAAAA
//              BBBBB
//              CCCCC
//              DDDDD
//              EEEEE
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        int a=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)a);
            }
            a++;
            System.out.println();
        }
    }
}
