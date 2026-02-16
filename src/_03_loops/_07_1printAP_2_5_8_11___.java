package _03_loops;

import java.util.Scanner;

public class _07_1printAP_2_5_8_11___ {
    public static void main(String[] args) {
        //ques : Display this AP : 2,5,8,11.... upto 'n' terms.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a = 2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a+3; //as common difference = 3
        }
    }
}
