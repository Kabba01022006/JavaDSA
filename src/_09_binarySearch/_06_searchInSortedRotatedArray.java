package _09_binarySearch;
//leetcode question 3
//suppose we are given an array [0,1,3,4,5,8,11,12],
//and it is left rotated by some value suppose here 3 , it
//will become [4,5,8,11,12,0,1,3] , and if the target=1,
//we need to find the index of 1
public class _06_searchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,8,11,12,0,1,3};
        int target = 1;
        //already done with the pivot index approach on leetcode , that uses 3 binary searches , first for finding the pivot element, second for checking if the element lies on the left, and third for checking if the element lies on the right.
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) {
                System.out.print(mid);
                break;
            }
            //check if the left part is sorted or not
            else if(arr[low]<=arr[mid]){ //left part is sorted
                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
    }
}
