package Week1;

import java.util.Arrays;

public class JavaProblem {

    public static void main(String[] args) {
        int[] ex1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        int[] ex2 = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        int[] ex3 = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};

        int[][] exs = {ex1,ex2,ex3};

        for (int[] ex : exs) {
            System.out.println(gap(ex));
        }

    }

    public static int gap(int[] input) {
        Arrays.sort(input);
        int max = 0;

        for (int i = 0; i < input.length-1; i++) {
            int dif = input[i+1]-input[i];
            if (dif > max) {
                max = dif;
            }
        }

        return max;
    }

}