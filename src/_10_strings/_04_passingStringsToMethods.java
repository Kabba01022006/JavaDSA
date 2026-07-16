package _10_strings;

public class _04_passingStringsToMethods {
    public static void main(String[] args) {
        String str = "Shobhit";
        System.out.println(str);
        change(str);
        System.out.println(str);

        //no change means strings does not behave as pass by reference in java like arrays do.
        //strings are immutable
        //strings mein pass by value hota hai
    }
    public static void change(String x){
        x = "hello";
    }
}
