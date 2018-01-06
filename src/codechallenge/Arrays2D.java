package codechallenge;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/18/17.
 */
public class Arrays2D {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int highestSum = -99;
        int[][] arrays = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrays.length - 2; i++) {
            for (int j = 0; j < arrays.length - 2; j++) {
                int glass = arrays[i][j] + arrays[i][j + 1] + arrays[i][j + 2]
                        + arrays[i + 1][j + 1] + arrays[i + 2][j] + arrays[i + 2][j + 1] + arrays[i + 2][j + 2];
                if (highestSum < glass) {
                    highestSum = glass;
                }
            }
        }

        System.out.println(highestSum);

    }

}
