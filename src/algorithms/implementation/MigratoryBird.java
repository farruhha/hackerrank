package algorithms.implementation;

import datastructures.array.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MigratoryBird {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int type1, type2, type3, type4, type5;
        type1 = type2 = type3 = type4 = type5 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 1) type1++;
            else if (ar[i] == 2) type2++;
            else if (ar[i] == 3) type3++;
            else if (ar[i] == 4) type4++;
            else if (ar[i] == 5) type5++;
        }
        int types[] = new int[]{type1, type2, type3, type4, type5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < types.length; i++) {
            if (max < types[i]) {
                max = types[i];
            }
        }
        for (int i = 0; i < types.length; i++) {
            if (max == types[i]) {
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
