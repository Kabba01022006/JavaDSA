package _06_arrays;

public class _15_reverseArray2 {
    // we can also use the concept of that we need to swap
    //first and last elem
    //second and second last elem
    //third and third last elem
    // so if our iterator is i , we need to swap , i and n-1-i (as for 0 we need n-1) so we can calculate
    // and we need to run the loop only till n/2 otherwise our array will remain the same as the swapped numbers will be again swapped

    public static void main(String[] args) {
        int[] arr = {12,34,63,12,99,84,-54,12,5,-99};
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
