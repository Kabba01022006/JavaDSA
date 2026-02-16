package _02_ifElse;
import java.util.Scanner;
public class _10_ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd");
    }
}
