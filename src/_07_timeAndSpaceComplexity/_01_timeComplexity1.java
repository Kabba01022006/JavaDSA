package _07_timeAndSpaceComplexity;

public class _01_timeComplexity1 {
    public static void main(String[] args) {
        //Ques : Calculate the time complexity of the following code.
        int n = 5;
        for(int i=0;i<=n;i++){
            System.out.println("Pizza");
        }
        //pizza will be printed n times
        //so this loop has n iterations
        //so total operations = n
        //Time complexity = O(n)
        for(int i=0;i<=n;i+=2){
            System.out.println("Pizza");
        }
        //pizza will be printed almost n/2 times
        //so this loop has n/2 iterations
        //so total operations = n/2
        //Time complexity = O(n/2) = O(n)
        n=10;
        for(int i=0;i<=n-7;i++){
            System.out.println("Pizza");
        }
        //pizza will be printed almost n-7 times
        //so this loop has n-7 iterations
        //so total operations = n-7
        //Time complexity = O(n-7) = O(n)

        //O(k*n) = O(n)
        //O(n-k) = O(n)


        //O(n) --> Linear time

    }
}
