package _02_ifElse;

import java.util.Scanner;

public class _11_ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int store = (n>=0) ? 100 : 0;
        System.out.println(store);
    }
}
