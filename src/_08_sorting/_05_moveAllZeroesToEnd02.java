package _08_sorting;

//this is the two pointer approach.
public class _05_moveAllZeroesToEnd02 {
    public static void main(String[] args){
        int[] nums = {1,0,-2,3,0,4,8,0,10,12};
        int i=0;
        int j=0;
        int n = nums.length;
        while(i<n && j<n){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[i]==0){
                i++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
