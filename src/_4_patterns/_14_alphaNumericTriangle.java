package _4_patterns;

import java.util.Scanner;

public class _14_alphaNumericTriangle {
    public static void main(String[] args) {
//        1
//        AB
//        123
//        ABCD
//        12345
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int num ;
        int alp ;
        for(int i=1;i<=n;i++){
            num=1;
            alp=65;
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(num);
                    num++;
                }
                else if(i%2==0){
                    System.out.print((char)alp);
                    alp++;
                }
            }
            System.out.println();
        }
    }
}
