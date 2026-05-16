package _06_arrays;

public class _06_maxElementInArray {
    public static void main(String[] args) {
        int[] arr = {-15, -8, -1, 0, 4, 9, -22, 17, 0, 31, -5, 12};
        int max = arr[0];
        // OR
        //int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

//similarly product of elements of array can be done by taking product=1
