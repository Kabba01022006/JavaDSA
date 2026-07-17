package _10_strings;

import java.sql.SQLOutput;

public class _05_builtInMethods {
    public static void main(String[] args) {
        String str1 = "Shobhit Kabba";
        System.out.println(str1.indexOf('a')); //gives us the index of first occurence of 'a'
        System.out.println(str1.lastIndexOf('a')); //gives us the last index of the occurace of 'a'
        System.out.println(str1.toLowerCase());
        //full string becomes lowerCase
        System.out.println(str1.toUpperCase());
        //full string becomes uppcarCase
        System.out.println(str1.contains("Kabba"));
        //lagataar wali string Kabba exists so true else false
        System.out.println(str1.startsWith("S"));
        System.out.println(str1.endsWith("a"));
        //checks if a strings starts with or ends with a charachter or substring



        str1="Shobhit";
        String str2="Kabba";
        System.out.println(str1.compareTo(str2));
        //if output is  positive means str1 is lexicographically greater than str2
        //if output is negative means str1 is lexicographically smaller than str2
        //if the output is 0 means str1 is lexicographically same as str2
        //IMP=>If two strings like harsh and harshit are compared suppose "harshit".compareTo("harsh"), it will not give us the difference of ascii values , but it will give us the difference of number of charachters , here the answer will be 2
        //if it was "harsh".compareTo("harshit"), answer will be -2 as harsh ke andar harshit se 2 charachters kum hai.

        System.out.println(str1.concat(str2));
        //or to concat we can simply use +

        System.out.println("Shobhit"+10);
        System.out.println('A'+5+"Shobhit");
        // this will first add the ascii value of A to 5 , and then concatenate


    }
}
