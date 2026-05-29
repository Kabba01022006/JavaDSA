package _08_sorting;

public class _02_bubbleSort {
    public static void main(String[] args) {

        //one pass fixes one last element in the right spot
        //so if there is an array of 100 elements , then 99 would be enough as the remaining one element will get fixed by itself when other 99 will be fixed.

        // after each pass, last subsequent element will be sorted , so if its the 0th pass the last element will be sorted so hum inner loop mein kuch nahi minus karenge.
        //if its the 1st pass ,the second last element will be sorted,
        //so thats why in inner loop, hum -1 karenge as we run it to the second last element only(inclusive). (understand it yourself deeply)
        int[] arr = {6,4,7,35,737,2,5,25};
        int n = arr.length;
        boolean isSwapped;
        for(int i=0;i<n-1;i++){
            isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false)   //means ek bhi baar swap nahi hua,means array is sorted
            break;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
