package _09_binarySearch;

public class _03_floorInASortedArray {
    public static void main(String[] args) {
        //floor in a sorted array
        int[] arr = {1,2,2,2,4,5,7,9};
        //if here target=3,
        //expected answer is 3 as 3 is the index of rightmost 2.
        int n = arr.length;
        int lo=0;
        int hi=n-1;
        int target=3;
        int ansIndex=0;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target){
                ansIndex=mid;
                lo=mid+1;
            }
            else{
                ansIndex=mid;
                lo=mid+1;
            }
        }
        System.out.print(ansIndex);
    }
}
