package _4_patterns;

import java.util.Scanner;

public class _32_diamondM2 {
    public static void main(String[] args) {
//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of upper rows : ");
        int n = sc.nextInt();
        int totalrows = (2*n)-1;
        int nsp = n-1;
        int nst = 1;
        for(int i=1;i<=totalrows;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
        }
    }
}
