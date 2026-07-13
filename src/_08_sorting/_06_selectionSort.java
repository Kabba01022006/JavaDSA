package _08_sorting;
//selection sort : select the smallest element and swap it with the first element of the subsequent subarray.
public class _06_selectionSort {
    public static void main(String[] args){
        int[] arr = {8,4,1,9,-3,6,5};
        int n = arr.length ;
        for(int i=0;i<n-1;i++){    //n-1 passes
            int minIndex = i;      //minIndex is the index of minimum element
            for(int j=i;j<n;j++){   //this loop till n as we need to scan the full sub array
                if(arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp ;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
