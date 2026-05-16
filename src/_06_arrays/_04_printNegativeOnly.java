package _06_arrays;

public class _04_printNegativeOnly {
    //ques : given an array, print negative elements only.
    public static void main(String[] args) {
        int[] arr = {23,53,-13,5,-6,-88,-34,56,78,23,-69};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
