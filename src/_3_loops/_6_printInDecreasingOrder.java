package _3_loops;

import java.util.Scanner;

public class _6_printInDecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i =n;i>0;i--){
            System.out.println(i);
        }

    }
}
