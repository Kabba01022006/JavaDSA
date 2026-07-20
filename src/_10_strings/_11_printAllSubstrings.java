package _10_strings;

public class _11_printAllSubstrings {
    public static void main(String[] args) {
        //QUES : Print all the possible substrings of a string.
        String name = "Rohan";
        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<=name.length();j++){
                System.out.print(name.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
