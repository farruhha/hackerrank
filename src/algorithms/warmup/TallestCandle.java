package algorithms.warmup;

import java.util.Scanner;

public class TallestCandle {
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int tallestCandle = 0;
        int candle = 0;
        for (int i = 0; i < n; i++) {
            if (tallestCandle < ar[i]) {
                tallestCandle = ar[i];
                candle = 0;
            }
            if (tallestCandle == ar[i]) {
                candle++;
            }
        }
        return candle;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
