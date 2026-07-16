package _10_strings;

public class _02_countVowels {
    public static void main(String[] args) {
        String str = "Shobhit";
        int n = str.length();
        str=str.toLowerCase();
        int vowelCount=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
        }
        System.out.print(vowelCount);
    }
}
