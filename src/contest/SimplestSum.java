package contest;

import java.util.Scanner;

public class SimplestSum {
    static long f(int k, int n) {
        long sum = 0;
        for (int i = 1; i <= n; i += 1) {
            sum += i;
            i *= k;
        }

        return sum;
    }

    static long simplestSum(int k, int a, int b) {
        long sums = 0;
        for (int i = a; i <= b; i++) {
            sums += f(k, i);
        }
        // Complete this function
        return sums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int k = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            long result = simplestSum(k, a, b);
            System.out.println(result);
        }
        in.close();
    }
}

