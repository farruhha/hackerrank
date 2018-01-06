package datastructures.stacks;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class MaximumElement {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        Stack<StackNode> stack = new Stack<>();
        while (size > 0) {
            int opt = scanner.nextInt();
            if (opt == 1) {
                int value = scanner.nextInt();
                max = Math.max(value, max);
                stack.add(new StackNode(value, max));
            } else if (opt == 2) {
                if (!stack.isEmpty()){
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    max = Integer.MIN_VALUE;
                } else {
                    max = stack.peek().maxValue;
                }
            } else if (opt == 3) {
                if (!stack.isEmpty()){
                    System.out.println(stack.peek().toString());
                }
            }
            size--;
        }
        scanner.close();
    }

    public static class StackNode {
        int value;
        int maxValue;

        public StackNode(int value, int maxValue) {
            this.value = value;
            this.maxValue = maxValue;
        }

        @Override
        public String toString() {
            return String.valueOf(maxValue);
        }
    }


}
