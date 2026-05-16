package _06_arrays;

public class _13_forEachLoop {
    // used to traverse data structures
    // we cannot modify array elements
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
