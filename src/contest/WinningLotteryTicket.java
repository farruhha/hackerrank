package contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WinningLotteryTicket {
    static int winningLotteryTicket(String[] tickets) {
        // Complete this function
        int counter = 0;
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < tickets.length - 1; i++) {
            for (int j = i + 1; j < tickets.length; j++) {
                if (isOk(tickets[i] + tickets[j], chars)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    static boolean isOk(String s1, char[] chars) {
        HashSet<Character> hashSet = new HashSet();
        for (int i = 0; i < s1.length(); i++) {
            hashSet.add(s1.charAt(i));
        }

        for (int i = 0; i < chars.length; i++) {
            if (!hashSet.contains(chars[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for (int tickets_i = 0; tickets_i < n; tickets_i++) {
            tickets[tickets_i] = in.next();
        }
        int result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}
