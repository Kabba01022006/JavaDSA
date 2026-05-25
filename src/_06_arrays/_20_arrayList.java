package _06_arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _20_arrayList {
    public static void main(String[] args) {
        //dynamic array, array can grow
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2)); //this 2 is index so at 2 index is 18 , this is how we access elements
        //changing an element
        arr.set(3,50);   //3rd index wala element 50 ban gaya

        //printing an ArrayList kinda pre formatted (internally loop is used)
        System.out.println(arr);
        //arraylist ki length nahi , size hota hai
        int n = arr.size();
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i)+" ");
        }
        for(int ele : arr){
            System.out.println(ele+" ");
        }

        arr.add(69);  //this adds the element to the end
        arr.add(0,48); // this adds the element to the desired index
        System.out.println(arr);
        arr.remove(5); //this will remove the element on index 5
        // in array list our array length changes dynamically so, in general so we should not use
        // it like the size is n , but instead we should use like arr.size() everytime instead of n

        //we can use collections
        Collections.reverse(arr);
        System.out.println(arr);


        //we can reverse by ourselves too
        int i = 0; int j = arr.size()-1;
        while(i>j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        ArrayList<Character> arr2 = new ArrayList<>();
    }
}
