package _06_arrays;

import java.util.Scanner;

public class _03_printDoubleOfArray {
    public static void main(String[] args) {
        // take an array as input and print the array of elements double of the original array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]*2+" ");
        }
    }
}
