package _09_binarySearch;

import java.sql.SQLOutput;

public class _01_basics {

    //binary search is mostly used when we are dealing with SORTED SEARCH SPACE for example sorted arrays..etc.
    public static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,49,510,615,9911,99999};
        int n = arr.length;
        int target = -4;
        int low=0;
        int high=n-1;
        int answer=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>arr[mid]) low=mid+1;
            else if(target<arr[mid]) high=mid-1;
            else{
                answer=arr[mid];
                break;
            }
        }
        System.out.print(answer);
    }
}
