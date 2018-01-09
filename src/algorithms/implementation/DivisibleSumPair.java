package algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPair {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int counter = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (i != j) {
                    if ((ar[i] + ar[j]) % k == 0) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}
