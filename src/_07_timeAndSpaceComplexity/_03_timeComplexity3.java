package _07_timeAndSpaceComplexity;

public class _03_timeComplexity3 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Hello World");
            }
        }

        //Total number of operations = m * n
        //Time complexity = O(m*n)

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Hello World");
            }
        }
        //Total number of operations = m * n
        //Time complexity = O(n*n) = O(n^2)   (Quadratic Time)

    }
}
