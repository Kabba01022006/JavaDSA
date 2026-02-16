package _01_basics;

import java.util.Scanner;

public class _08_inputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radius = sc.nextDouble();
        double area = 3.141592 * radius * radius;
        System.out.print("Area is : ");
        System.out.println(area);
    }
}
