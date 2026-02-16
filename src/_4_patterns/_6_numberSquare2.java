package _4_patterns;

import java.util.Scanner;

//public class _6_numberSquare2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter side : ");
//        int a=1;
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(a);
//            }
//            a++;
//            System.out.println();
//        }
//    }
//}

// OR

public class _6_numberSquare2 {
    public static void main(String[] args) {
        // ques : 11111
        //        22222
        //        33333
        //        44444
        //        55555
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
