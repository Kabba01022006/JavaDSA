package _06_arrays;

public class _14_reverseArray1 {
    public static void main (String[] args){
        // we need to reverse the array in place
        int[] arr = {4,3,8,54,6,23,524,75};
        int i = 0;
        int j = arr.length-1;
        while(i>j){
            int temp = i ;
            i = j ;
            j = temp ;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){

        }
    }
}
