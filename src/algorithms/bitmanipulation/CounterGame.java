package algorithms.bitmanipulation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CounterGame {
    static String counterGame(long n) {
        // Complete this function
        int counter = 0;
        while (n > 1) {
            if ((n & (n - 1)) != 0) {
                int count = 0;
                long tempN = n;

                while (tempN > 0) {
                    tempN = tempN / 2;
                    count++;
                }
                n = n - (int) Math.pow(2, count - 1);
            } else {
                n = n - n / 2;
            }
            counter++;
        }
        return counter % 2 == 0 ? "Richard" : "Louise";
    }

    public static void main(String[] args) {
       // System.out.println(fibStack(7));
        splitArray(new int[]{2,3,5,10,5,5});
    }

    public static boolean splitArray(int[] nums) {
        return helper(nums, 0, 0);
    }

    private static boolean helper(int[] nums, int i, int sum) {
        System.out.println(i + " " + sum);

        if (nums.length == i) return sum == 0;
        return helper(nums, i + 1, sum + nums[i]) || helper(nums, i + 1, sum - nums[i]);
    }


    public int fib(int n) {
        int a = 0;
        int b = 0;
        // 0
        if (n <= 2) {
            return 1;
        } else {
            int t1 = fib(n - 2);
            // 1
            a = t1;
            int t2 = fib(n - 1);
            // 2
            b = t2;
            return a + b;
        }
    }

    static class Frame {
        int pos = 0;
        int n;
        int a = 0;
        int b = 0;

        public Frame(int n) {
            this.n = n;
        }
    }

    public static int fibStack(int n) {
        Deque<Frame> stack = new ArrayDeque<>();
        stack.push(new Frame(n));
        int ret = 0;
        while (!stack.isEmpty()) {
            Frame cur = stack.peek();
            //System.out.println(cur.n + " " + cur.pos);
            switch (cur.pos) {
                case 0:
                    if (cur.n <= 2) {
                        ret = 1;
                        stack.pop();
                    } else {
                        stack.push(new Frame(cur.n - 2));
                        cur.pos = 1;
                    }
                    break;
                case 1:
                    cur.a = ret;
                    stack.push(new Frame(cur.n - 1));
                    cur.pos = 2;
                    break;
                case 2:
                    cur.b = ret;
                    ret = cur.a + cur.b;
                    stack.pop();
                    break;
            }
        }
        return ret;
    }
}
