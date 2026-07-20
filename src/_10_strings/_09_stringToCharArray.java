package _10_strings;

public class _09_stringToCharArray {
    public static void main(String[] args) {
        String name = "Shobhit";
        char[] arr = name.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
