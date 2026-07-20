package _10_strings;

public class _14_reverseStringBuilder {
    public static void main(String[] args) {
        //how to reverse a string in a StringBuilder
        String n = "Shobhit";
        StringBuilder name = new StringBuilder(n);
//        name.reverse();
//        System.out.println(name);
        //this also works

        //or we can do it manually like
//        int i=0;
//        int j=name.length()-1;
//        while(i<j){
//            char temp = name.charAt(i);
//            name.setCharAt(i,name.charAt(j));
//            name.setCharAt(j,temp);
//            i++;
//            j--;
//        }
//        System.out.println(name);

        //That normal manual seemed a bit confusing so we can also do
        int i=0;
        int j=name.length()-1;
        while(i<j){
            char temp1=name.charAt(i);
            char temp2=name.charAt(j);
            name.setCharAt(i,temp2);
            name.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(name);
    }
}
