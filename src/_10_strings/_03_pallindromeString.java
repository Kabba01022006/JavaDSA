package _10_strings;

public class _03_pallindromeString {
    public static void main(String[] args){
        String str="malayalam";
        int i=0;
        int j=str.length()-1;
        boolean isPalindrome = true;
        while(i<j){
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(left!=right){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.print(isPalindrome);
    }
}
