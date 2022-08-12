package Week2;

import java.lang.Math;
import java.util.ArrayList;

public class JavaProblems {

    public static void main(String[] args) {
        System.out.println("Problem 1:");

        System.out.println(rootFinder(1, 2, -3));
        System.out.println(rootFinder(2, -7, 3));
        System.out.println(rootFinder(1, -12, -28));

        System.out.println("Problem 2:");

        System.out.println(perfect(6));
        System.out.println(perfect(28));
        System.out.println(perfect(496));
        System.out.println(perfect(12));
        System.out.println(perfect(97));
    }


    public static double rootFinder(int a, int b, int c) {
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }

    public static boolean perfect(int a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 1; i < a; i++) {
            if (a%i == 0) {
                b.add(i);
            }
        }

        int sum = 0;
        for (Integer e : b) {
            sum = sum + e;
        }

        return sum == a;

    }
}
