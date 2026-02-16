package _3_loops;

public class _13_continue {
    public static void main(String[] args) {
        // when we use continue,  it means those iterations following that condition will be skipped..
        //So in this case all iterations following (i%2==0) will be skipped and odd numbers will be printed.
        for(int i=1;i<=100;i++){
            if(i%2==0) continue;
            System.out.println(i);
        }
    }
}
