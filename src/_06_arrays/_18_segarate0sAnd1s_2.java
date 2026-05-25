package _06_arrays;

public class _18_segarate0sAnd1s_2 {
    // if the array is {1,1,0,1,0,0,1,0,1,0,1,1};
    // we need to make it {0,0,0,0,0,1,1,1,1,1,1,1};
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1,0,1,0,1,1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
