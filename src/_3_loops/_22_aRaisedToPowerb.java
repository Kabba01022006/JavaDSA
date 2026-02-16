package _3_loops;

import java.util.Scanner;

public class _22_aRaisedToPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();
        if(power==0) System.out.println(1);
        else{
            int res = 1;
            for(int i=1;i<=power;i++){
                res=base*res;
            }
            System.out.println(res);
        }
    }
}
