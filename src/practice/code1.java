package practice;
import java.util.*;
public class code1 {
    //take input a number and tell if its an integer or not
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double num = sc.nextDouble();
        int nonDec = (int)num;
        double diff = num - nonDec ;
        if(diff==0) System.out.println("Is an integer");
        else System.out.println("Not an Integer");
    }
}
