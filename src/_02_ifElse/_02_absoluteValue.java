package _02_ifElse;
import java.util.Scanner;

public class _02_absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n < 0) {
            n = n * (-1);
            System.out.println(n);
        } else {
            System.out.println(n);
        }
    }
}
