package _08_sorting;

public class _01_checkIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,5,24,6,36,7,4,61,67};

        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]) {
                isSorted=false;
                break;
            }
        }
        System.out.print(isSorted);
    }
}
