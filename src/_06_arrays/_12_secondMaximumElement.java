package _06_arrays;

public class _12_secondMaximumElement {
    public static void main(String[] args) {
        int[] arr = {4,10,10,6,3,8};
//        int[] arr = {2,2,2,2,2,2,2};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println("Max : "+max);
        if(smax==Integer.MIN_VALUE) System.out.println("No second max exists.");
        else System.out.println("Smax : "+smax);
    }
}
