package algorithms.sorting;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {
    static String[] bigSorting(String[] arr) {
        // Complete this function
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;


            while (j >= 0 && (new BigInteger(key)).compareTo(new BigInteger(arr[j])) < 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
