package algorithms.implementation;

import java.util.Scanner;

public class BonAppetite {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int totalcost = 0;
        for (int i = 0; i < ar.length; i++) {
            totalcost += ar[i];
        }
        totalcost = totalcost - ar[k];
        if (b - totalcost / 2  == 0) {
            System.out.println("Bon Appetit");
        }
        return b - totalcost / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        System.out.println(result);
    }
}
