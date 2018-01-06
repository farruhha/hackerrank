package algorithms.implementation;

import java.util.Scanner;

public class GradingStudent {

    static int[] solve(int[] grades) {
        // Complete this function
        int[] mark = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int rounded = (grades[i] / 5 + 1) * 5;
            if (rounded >= 40) {
                mark[i] = ((rounded - grades[i]) < 3) ? rounded : grades[i];
            } else {
                mark[i] = grades[i];
            }
        }
        return mark;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
