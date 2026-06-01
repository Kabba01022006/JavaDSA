package _08_sorting;

public class _06_twoSumOptimised {
    //ques: find both the elements whoose sum == target.(do without O(n^2) appraoch)
    //given that the array is sorted*** IMP , THIS ONLY WORKS FOR SORTED ARRAY
    public static void main(String[] args) {
        int target = 26;
        int[] arr = {3,3,4,5,5,6,7,7,8,12,24,25,34,35,42,47,48,58};
        int n = arr.length;
        int i=0;
        int j=n-1;
        boolean found = false;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==target){
                System.out.println("elem1 :"+arr[i]+" elem2 :"+arr[j]);
                found=true;
                break;
            }
            else if(sum<target) i++;
            else j--;
        }
        if(!found) System.out.print("doesnt exist"); //or we could write if(found==false) to
    }
}
