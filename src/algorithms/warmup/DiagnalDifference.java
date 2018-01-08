package algorithms.warmup;

import java.util.Scanner;

public class DiagnalDifference {
    static int diagonalDifference(int[][] a) {
        // Complete this function
        int size = a.length;
        int leftSide = 0;
        int rightSide = 0;
        for (int i = 0; i < size; i++) {
            leftSide += a[i][i];
            rightSide += a[i][(size - 1) - i];
        }
        return Math.abs(rightSide - leftSide);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
