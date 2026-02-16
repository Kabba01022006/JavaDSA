package _04_patterns;

import java.util.Scanner;

public class _08_alphabetSquare4 {
    public static void main(String[] args) {
//      ques :  aaaa
//              BBBBB
//              ccccc
//              DDDDD
//              eeeee
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        int odd=97;  //a
        int even=65; //A
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2!=0) System.out.print((char)odd);
                else if (i%2==0) System.out.print((char)even);
            }
            odd++;
            even++;
            System.out.println();
        }
    }
}
