package _3_loops;

public class _12_break {
    public static void main(String[] args) {
        //The break statement immediately terminates a loop or switch block when a specific condition is met.
        for(int i=1;i<=100;i++){
            System.out.println(i);
            if(i==50) break;
        }
    }
}
