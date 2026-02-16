package _2_ifElse;

import java.util.Scanner;

public class _4_profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();
        int profit = sp - cp;
        int loss = cp - sp;
        if(sp>cp){
            System.out.println("Profit : "+(profit));
        }
        else if(sp<cp){
            System.out.println("Loss : "+(loss));
        }
        else{
            System.out.println("No profit No loss");
        }
    }
}
