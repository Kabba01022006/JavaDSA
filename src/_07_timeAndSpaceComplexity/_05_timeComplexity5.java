package _07_timeAndSpaceComplexity;

public class _05_timeComplexity5 {
    public static void main(String[] args) {
        //ques : Calculate the time complexity
        int n = 53;
        for(int i=1;i<n;i*=2){
            System.out.println("yoo");
        }
        //through the concept of GP , we came to know that
        //its time complexity is O(log n)
        /*
        The number is growing/shrinking exponentially
        So complexity is usually:
        O(log n)
        */
        n = 36;
        for(int i=1;i<n;i*=2){
            System.out.println("yoo");
        }
        //shrinking exponentially so O(log n)


        for(int i=1;i<n;i+=i){
            System.out.println("yoo");
        }
        //1 , 2 , 4 , 8 , 16 , 32 ......
        //so this is also O(log n)

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 1; j <= n; j++) {
                System.out.println("GFG");
            }
        }

        //time complexity of outer code is log n
        //time complexity of inner code is n
        // so, Time complexity = O(n log n)

        for(int i=1; i*i<=n;i++){
            System.out.println("hello");
        }

        //in this code we can se , i*i<=n, so i=√n
        //therefore i is going from 1..2..3..to √n
        //therefore Time complexity = √n
    }
}


//final time complexity order
//basically jitna number bada, utna time jyada lagega

//O(1) < O(log n) < O(√n) < O(n) < O(n log n) < O(n^2) < O(n^3) < O(2^n) < O(n!)