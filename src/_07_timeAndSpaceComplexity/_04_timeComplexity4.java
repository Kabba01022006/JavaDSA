package _07_timeAndSpaceComplexity;

public class _04_timeComplexity4 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.println("bye");
            }
        }
        // Outer loop runs n times
        // Inner loop runs 1 + 2 + 3 + ... + n times total
        // Total operations = n(n+1)/2 => Time Complexity = (n^2 + n)/2
        // we can ignore the constant so its (n^2 + n)
        // now we can just ignore n also as higher degree ki aukaat jyada hoti hai
        // so Time complexity = O(n2)
    }
}
