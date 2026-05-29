package _08_sorting;

public class _03_bubbleSortDescending {
    //ques : sort an array in descending order (greater to smaller) using bubble sort.

    public static void main(String[] args) {
        int[] arr = {6,4,7,35,737,2,5,25};
        int n = arr.length;
        boolean isSwapped;
        for(int i=0;i<n-1;i++){
            isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] < arr[j+1]){
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
