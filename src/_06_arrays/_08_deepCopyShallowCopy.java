package _06_arrays;

import java.util.Arrays;

public class _08_deepCopyShallowCopy {
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
        int[] x = arr;
        // x is a shallow copy of arr
        // means x arr hi hai, like both are pointing to the same array
        // if we change x
        x[3] = 69 ;
        System.out.println(arr[3]);  //arr is changed

        //deep copy
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 99;
        System.out.println(arr[0]); //this remains 10 , so no change


        //so deep copy means the actual copy of an array that we created of our original array , and when we do some change in deep copy, nothing happens to original array.
        //shallow copy means not actual copy , but basically a fake copy that points to the original array, so when we do some change in shallow copy, original array actually changes.
    }
}
