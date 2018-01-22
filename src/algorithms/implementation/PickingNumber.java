package algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class PickingNumber {
    static int pickingNumbers(int[] a) {
        // Complete this function
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i] - a[j]) <= 1) {

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
