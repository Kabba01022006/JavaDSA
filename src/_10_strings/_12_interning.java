package _10_strings;

public class _12_interning {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        //in this case s1 and s2 both are pointing to one string "hello",basically the address of hello is same

        String name1 = new String("shobhit");
        String name2 = new String("shobhit");
        //here in this case name1 is pointing to "shobhit" and name2 is pointing to "shobhit" , but bot the strings are at the different memory locations so they both  are new individual free strings

    }
}
