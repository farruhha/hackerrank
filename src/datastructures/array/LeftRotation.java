package datastructures.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/18/17.
 */
public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        int[] temp = new int[a.length];
        System.arraycopy(a, 0, temp, a.length-d, d);
        System.arraycopy(a,d,temp,0,a.length-d);
        return temp;
    }
}
