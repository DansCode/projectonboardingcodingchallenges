package Week2;

import java.lang.Math;

public class JavaProblems {

    public static void main(String[] args) {
        System.out.println(rootFinder(1, 2, -3));
        System.out.println(rootFinder(2, -7, 3));
        System.out.println(rootFinder(1, -12, -28));
    }


    public static double rootFinder(int a, int b, int c) {
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
}
