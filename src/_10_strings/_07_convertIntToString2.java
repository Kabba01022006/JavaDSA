package _10_strings;

import java.util.Scanner;

public class _07_convertIntToString2 {
    public static void main(String[] args) {
        //or we can simply use builtin string method
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
    }
}
