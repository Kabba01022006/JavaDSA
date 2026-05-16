package _06_arrays;

public class _10_multiplyOddAndEven {
    //multiply odd indexed elements by 2 and add 10 to even indexed elements.
    public static void main(String[] args){
        int[] arr = {3,745,23,74,2,57,32};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = arr[i]+10; //arr[i]+=10
            }
            else{
                arr[i] = arr[i]*2; //arr[i]*=2
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
