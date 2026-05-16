package _06_arrays;

public class _01_basics {
    // in java , arrays are objects
    public static void main(String[] args){
        int[] arr = {23,84,24,11,78,34};
        // indexing
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
//        System.out.println(arr); This will give us a weird thing.
        //updating the value of any element
        arr[5] = 69;
        System.out.println(arr[5]);   //arr[5] successfully changed

        //creating an array :
        int[] brr = new int[4]; //creates an array of size 4 : 0 1 2 3
        brr[0] = 23;
        brr[1] = 39;
        brr[2] = 48;
        brr[3] = 71;

        for(int i=0;i<4;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        System.out.println(brr.length);

        //default values of arrays in java is 0
        int[] defVal = new int[10];
        int n= defVal.length;
        for(int i=0;i<n;i++){
            System.out.print(defVal[i]+" ");
        } // output will be 0 0 0 0 0 0 0 0 0 0
    }
}
