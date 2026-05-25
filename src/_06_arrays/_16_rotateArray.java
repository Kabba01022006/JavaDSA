package _06_arrays;

import java.util.Scanner;

public class _16_rotateArray{
    // in this ques we need to rotate the array to the left.6
    public static void main(String[] args) {
        int k;
        System.out.print("Enter the number of steps you want to rotate the array : ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        int n;
        System.out.print("Enter the size of your array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(k>n){
            k=k%n;
        }
        // instead of this , we should use directly k = k % n, because it handles all the three test cases
        // if k > n , it'll give us the smaller k i.e. correct effective rotations
        // if k==n , it'll give us k=0 , means no rotations which is correct
        // if k < n , it'll give us the same k ,i.e. no change.
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=0,j=n-k-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=n-k,j=n-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // we can use logic to make any array rotate by right too.
}


//but better approach is using a reverse function in this code

