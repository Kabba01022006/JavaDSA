package _01_basics;

public class _06_areaOfCircle {
    public static void main(String[] args) {
        double radius = 3.8;
        double area = 3.141592 * radius * radius;
        System.out.printf("%.2f",area);
    }
}

// for simple printing we can use println()
// but for formatted printing , we nee to use printf()