package codechallenge;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by farruhhabibullaev on 9/20/17.
 */
public class DataType {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

                /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String string = "";


        /* Read and save an integer, double, and String to your variables.*/
        a = Integer.parseInt(scan.nextLine());
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        b = Double.parseDouble(scan.nextLine());
        string = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(String.valueOf(i + a));
        /* Print the sum of the double variables on a new line. */
        System.out.println(String.valueOf(d + b));
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + string);

        scan.close();
    }
}
