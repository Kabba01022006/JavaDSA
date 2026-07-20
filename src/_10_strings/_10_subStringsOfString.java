package _10_strings;

public class _10_subStringsOfString {
    public static void main(String[] args) {
        String name = "Jaishankar";
        System.out.println(name.substring(3));
        //this will print from 3rd index(inclusive) upto the last char

        System.out.println(name.substring(0,3));
        //this will print from 0 to 2

        System.out.println(name.substring(0));
    }
}
