package _10_strings;

public class _13_stringBuilders {
    public static void main(String[] args) {
        //if we do :
        //String s = "Shobhit"
        //and then do s+="Kabba"
        //for each iteration it makes a new string...consumes a lot of memory and space ,therefore StringBuilder is used
        StringBuilder name = new StringBuilder("Hello");
        name.append("World");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.capacity());

        StringBuilder s1 = new StringBuilder("Shobhit");
        s1.append("Kabba");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
    }
}
