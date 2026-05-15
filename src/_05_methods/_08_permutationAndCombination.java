package _05_methods;

import java.util.Scanner;

public class _08_permutationAndCombination {

    public static int fact(int x){
        int res=1;
        for(int i=x;i>=1;i--){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        //ncr or npr can never give result in decimal ,they are always integers.
        //mathematical condition : r<=n always
        int ncr = fact(n) / (fact(r) * fact(n-r));
        int npr = fact(n) / fact(n-r);
        System.out.println("Combination : "+ncr);
        System.out.println("Permutation : "+npr);
    }
}
