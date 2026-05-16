package _06_arrays;
//this is known as linear search
public class _11_searchInArray {
    public static void search(int[] arr,int x){
        boolean flag = false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                flag = true;
            }
        }
        if(flag==true){   // we can also write if(flag)
            System.out.println("the element exists in array");
        }
        else{
            System.out.println("the element does not exist in array");
        }
    }
    public static void main(String[] args){
        int[] arr = {34,-23,-66,73,15,9,157};
        int x = 67;
        search(arr,x);
    }
}
