package _10_strings;

import java.util.Scanner;

//take a user input integer and convert it into string and print it
public class _06_convertIntToString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        s=s+n;
        System.out.println(s);
    }
}
