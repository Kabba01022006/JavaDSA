package _1_basics;

public class _11_2charAndASCII {
    public static void main(String[] args) {
        char first = 'a';
        int _first = first; //implicit typecasting
        char second = 'A';
        int _second = (int)second;//explicit typecasting
        char third = '5';
        int _third = (int)third;
        char fourth = '$';

        System.out.println(first);
        System.out.println(_first);
        System.out.println(second);
        System.out.println(_second);
        System.out.println(third);
        System.out.println(_third);
        System.out.println((int)fourth);

        //Another way of getting the ASCII value is adding the integer 0 , what happens is that when we write suppose char ch = 'c';
        // Internally this character c is always stored as 99 which is the ASCII value of it so when we do (ch + 0) , it internally computes 99 + 0 and integer + integer and hence gives us 99.
        char ch = 'c';
        System.out.println(ch+0);//this gives us 99

        // we can also opposite typecast from int to char.
        int x = 43;
        char _char = (char)x;
        System.out.println(_char); // means 43 is ASCII of +
    }
}
