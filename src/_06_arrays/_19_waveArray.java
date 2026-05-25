package _06_arrays;

public class _19_waveArray {
    public static void main(String[] args) {
//       if the array is given in a sorted manner : {1,7,9,23,55,67,88,92}
//       we want to make it such that first element is big , then small then big ....
//       {7, 1, 23, 9, 67, 55, 92, 88} :peakValleyPeakValleYPeakValley pattern
        int[] arr = {2,4,7,8,9,10};
        for(int i=0;i< arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
