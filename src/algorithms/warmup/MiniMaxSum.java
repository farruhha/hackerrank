package algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        // Complete this function
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    counter += arr[j];
                }
            }
            if (counter > max) {
                max = counter;
            }
            if (counter < min) {
                min = counter;
            }
            counter = 0;
        }
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
