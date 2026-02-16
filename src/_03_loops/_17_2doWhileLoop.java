package _03_loops;

public class _17_2doWhileLoop {
    public static void main(String[] args) {
        int i=11; // loop will run atleast 1 time even if the condition is false, and then it further may or may not run.
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

    }
}
