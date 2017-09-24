package datastructures.array;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/20/17.
 */
public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] intArray = new long[n];
        for (int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for (int j = a - 1; j <= b - 1; j++) {
                intArray[j] = intArray[j] + k;
            }

        }
        System.out.println(findMax(intArray));
        in.close();
    }

    public static long findMax(long[] intArray) {
        long max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

}
