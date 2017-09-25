package codechallenge;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/24/17.
 */
public class LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < times; i++) {
            seperateString(scanner.nextLine());
        }
    }

    private static void seperateString(String string) {
        String evenString = "";
        String oddString = "";
        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                evenString += string.charAt(0);
            } else if (i % 2 != 0) {
                oddString += string.charAt(i);
            } else {
                evenString += string.charAt(i);
            }
        }
        System.out.println(evenString + " " + oddString);
    }
}
