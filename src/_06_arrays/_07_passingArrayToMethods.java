package _06_arrays;

public class _07_passingArrayToMethods {

    public static void main(String[] args) {
        int[] x = {3, 45, 68, 27, 55};
        //int[] x is a reference variable, it means that
        //array = object in heap memory
        //x = reference variable pointing to it
        //x stores a reference to an object
        //not the actual array contents directly
        System.out.println(x[2]); //before using function
        change(x);
        System.out.println(x[2]); //after using function
    }
//we can observe that when we pass an array to method, it can change it.

    public static void change(int[] y) {
        y[2] = 120;
    }
// Arrays in Java are objects stored in heap memory.
// x is a reference variable that stores the reference of the array object.

// When x is passed to the method,
// Java creates a copy of the reference stored in x
// and passes that copied reference to y.

// x and y are different reference variables,
// but both point to the same array object in memory.

// Therefore, any change made to the array using y
// also affects the array accessed using x.
}