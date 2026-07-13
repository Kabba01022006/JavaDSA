package _08_sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_commonElements {
    // ques : Given two integer arrays a[] and b[]. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.
    public static void main(String[] args) {
        //first sort both the arrays as its easy
        int[] a = {3,1,2,1,1,4,5,5};
        int[] b = {6,1,1,4,4,2,8};
        //expected output : [1, 1, 2, 4]
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0 ;
        int j = 0 ;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                answer.add(a[i]);
                i++;
                j ++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
        }
        System.out.println(answer);
    }
}
