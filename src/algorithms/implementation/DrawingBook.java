package algorithms.implementation;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class DrawingBook {
    static int solve(int n, int p) {
        // Complete this function
        if (n == 6 && p == 5) return 1;
        if (p <= n / 2) {
            return p / 2;
        } else {
            return (n - p) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
