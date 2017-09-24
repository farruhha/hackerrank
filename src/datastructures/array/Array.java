package datastructures.array;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/18/17.
 */
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int j = length - 1; j >= 0; j--) {
            System.out.print(intArray[j]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
