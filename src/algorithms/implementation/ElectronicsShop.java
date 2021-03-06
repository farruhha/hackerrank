package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int s) {
        // Complete this function
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max = 0;
        for (int i = keyboards.length - 1; i >= 0; i--) {
            for (int j = drives.length - 1; j >= 0; j--) {
                if (keyboards[i] + drives[j] <= s) {
                    if (max < (keyboards[i] + drives[j])) {
                        max = keyboards[i] + drives[j];
                    }
                }
            }
        }
        return max == 0 ? -1 : max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for (int drives_i = 0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
