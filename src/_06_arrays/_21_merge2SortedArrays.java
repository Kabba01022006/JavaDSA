package _06_arrays;
import java.util.Arrays;
public class _21_merge2SortedArrays {
    public static void main(String[] args) {
        //ques : merge two sorted arrays in a single big array. (very imp)
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8};

        int[] c = new int[a.length + b.length];
        int i=0,j=0,k=0;
        /* i will iterate over a, j will iterate over b, k will iterate over c */
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        //jab loop break hoga tab means ek array khatam ho chuka hoga, lekin dusra array bacha hua hoga, to ab bache hue array ko (jiska humein nahi pata ki ko konsi array hai) , usko add karenge.
        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        for(i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
} 
