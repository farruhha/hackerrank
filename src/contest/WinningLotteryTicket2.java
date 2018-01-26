package contest;

import java.util.Arrays;
import java.util.Scanner;

public class WinningLotteryTicket2 {
    static long winningLotteryTicket(String[] tickets) {
        long[] nums = new long[1024];
        for (String s : tickets) {
          int k = 0;
          for (int i = 0; i < s.length(); i++) {
              k |= 1 << (s.charAt(i) - '0');
          }
          nums[k]++;
        }
        int target = 1023;
        long count = nums[target] * (nums[target] - 1) / 2;
        for (int i = 0; i <= target; i++) {
            for (int j = i + 1; j <= target; j++) {
                if (target == (i | j)) {
                    count += nums[i] * nums[j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        long result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}
