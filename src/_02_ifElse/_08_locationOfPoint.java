package _02_ifElse;

import java.util.Scanner;

public class _08_locationOfPoint {
    public static void main(String[] args) {
        //Ques : Take input a point (x,y) , write a program to find out if it lies in the 1st quadrant, 2nd quadrant, 3rd quadrant, 4th quadrant, on the x-axis, y-axis or at the origin.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        if(x==0 && y==0)
            System.out.println("Origin");
        else if(x==0 && y!=0)
            System.out.println("Lies on y-axis");
        else if(x!=0 && y==0)
            System.out.println("Lies on x-axis");
        else if(x>0 && y>0)
            System.out.println("1st quadrant");
        else if(x<0 && y>0)
            System.out.println("2nd quadrant");
        else if(x<0 && y<0)
            System.out.println("3rd quadrant");
        else if(x>0 && y<0)
            System.out.println("4th quadrant");
    }
}
