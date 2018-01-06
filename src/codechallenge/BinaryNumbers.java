package codechallenge;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/30/17.
 */
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binaryFormat = Integer.toString(n, 2);
        int maxCon = 0;
        int counter = 0;
        for (int i = 0; i < binaryFormat.length(); i++) {
            if (String.valueOf(binaryFormat.charAt(i)).equals("1")) {
                counter++;
                if (maxCon < counter) {
                    maxCon = counter;
                }
            } else {
                counter = 0;
            }


        }
        System.out.println(maxCon);
    }
}
