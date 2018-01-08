package algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        // Complete this function
        DecimalFormat df = new DecimalFormat("#.#######");
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) zero++;
            else if (arr[i] > 0) positive++;
            else negative++;
        }
        positive = positive / arr.length;
        negative = negative / arr.length;
        zero = zero / arr.length;


        System.out.println(df.format(positive));
        System.out.println(df.format(negative));
        System.out.println(df.format(zero));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
