package algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocalate {

    static int solve(int n, int[] s, int d, int m) {
        // Complete this function
        if (m >= n) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < m; j++) {

                }
            }
        } else {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
