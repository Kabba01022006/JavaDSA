package _5_methods;

public class _1_builtIn {
    public static void main(String[] args) {
        double _sqrt = Math.sqrt(4);
        double _cbrt = Math.cbrt(8); // cuberoot
        //int x = Math.sqrt(4); ->This is wrong.
        //double data type is necessary for using sqrt and cbrt method.
        double _pi = Math.PI;
        int _abs = Math.abs(-5); // gives absolute value.
        double _floor = Math.floor(6.9); // this gives the floor value or we can say Greatest Integer Function , (***TO THE LEFT***)
        double _ceil = Math.ceil(6.7); // this gives the ceil value (***TO THE RIGHT***)
        int _minimum = Math.min(5,9);
        int _maximum = Math.max(5,9);
        // we can give int , long , float , double values here too , if we used mixed , then the smaller data type will get converted into the bigger data type.
        double _power = Math.pow(2,3); //we can use int as well.
        //base can be a double
        //but power should be a integer (no real number)
        // both base and power can be positive and negative.
        double _round = Math.round(12.49);
        System.out.println(_sqrt);
        System.out.println(_cbrt);
        System.out.println(_pi);
        System.out.println(_abs);
        System.out.println(_floor);
        System.out.println(_ceil);
        System.out.println(_minimum);
        System.out.println(_maximum);
        System.out.println(_power);
        System.out.println(_round);
    }
}
