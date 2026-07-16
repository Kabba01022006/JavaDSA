package _10_strings;

public class _01_basics {
    public static void main(String[] args) {
        char[] arr = {'s','h','o','b','h','i','t'};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String str = "Shobhit Kabba";
        System.out.println(str);

        System.out.print(str.charAt(0));
        int n = str.length(); //spaces are counted
    }
}
