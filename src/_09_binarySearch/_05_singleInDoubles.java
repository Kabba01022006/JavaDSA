package _09_binarySearch;
//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//find and print that single integer
//Your solution must run in O(log n) time and O(1) space.
public class _05_singleInDoubles {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9};
        int n=arr.length;
        if(n==1) System.out.print(arr[0]);
        if(arr[0]!=arr[1]) System.out.println(arr[0]);
        if(arr[n-1]!=arr[n-2]) System.out.println(arr[n-1]);
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) System.out.println(arr[mid]);
            int first=mid;
            int second=mid;
            if(arr[mid-1]==arr[mid])
                first=mid-1;
            else
                second=mid+1;
            int leftcount = first - lo ;
            int rightcount = hi - second ;
            if(leftcount%2==0)
                lo = second+1;
            else
                hi = first-1;
        }
    }
}
