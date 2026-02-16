package _01_basics;

public class _12_incrementDecrement {
    public static void main(String[] args) {
        int x;
        x = 10;
        System.out.println(x++);
        System.out.println(x);
        x = 10;
        System.out.println(++x);
        System.out.println(x);

        // x++ means post-increment , means ki pehle x ki original value ka use hoga then increment hoga.
        // ++x means pre-increment , means ki pehle hi x ki value ka increment hojayega and then use karte raho.
        // same goes for x-- and --x
    }
}
