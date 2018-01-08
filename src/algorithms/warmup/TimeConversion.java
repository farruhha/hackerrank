package algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String amPm = s.substring(s.length() - 2, s.length());
        String hours = s.substring(0, 2);
        String print = "";
        if (amPm.equals("AM")) {
            if (hours.equals("12"))
                print = "00" + s.substring(2, s.length() - 2);
            else {
                print = s.substring(0, s.length() - 2);
            }
        } else {
            if (!hours.equals("12")) {
                int inner = (hours.charAt(0) == '0') ? ((int) Integer.parseInt(hours.substring(1, 2)) + 12) : Integer.parseInt(hours) + 12;
                print = inner + "" + s.substring(2, s.length() - 2);
            } else {
                print = s.substring(0, s.length() - 2);
            }

        }

        return print;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
