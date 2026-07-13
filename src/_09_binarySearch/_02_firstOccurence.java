package _09_binarySearch;
//give the index of the first occurence of the given target.
//if not found return -1
public class _02_firstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4,5,6,7,8,9};
        int l=0;
        int h=arr.length-1;
        int target=3;
        int ans=-1;
        //expected answer 4
        while(l<=h){
            int mid = (l+h)/2;
            if(target>arr[mid]) l=mid+1;
            else if(target<arr[mid]) h=mid-1;
            else{ //target==arr[mid]
                ans=mid;
                h=mid-1;
            }
        }
        System.out.print(ans);
    }
}
