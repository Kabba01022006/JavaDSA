package _06_arrays;

public class _17_segarate0sAnd1s_1 {
    // if the array is {1,1,0,1,0,0,1,0,1,0,1,1};
    // we need to make it {0,0,0,0,0,1,1,1,1,1,1,1};
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1,0,1,0,1,1};
        int zeroCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
        }
        for(int i=0;i<zeroCount;i++){
            arr[i] = 0;
        }
        for(int j=zeroCount;j< arr.length-1;j++){
            arr[j] = 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
