package algorithms.implementation;

import java.util.Scanner;

public class CountingValley {
    static int countingValleys(int n, String s) {
        // Complete this function
        int counter = 0;
        int valleyCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                counter--;
            } else {
                counter++;
                if (counter == 0) {
                    valleyCounter++;
                }
            }

        }
        return valleyCounter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
