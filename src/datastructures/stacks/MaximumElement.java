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
        long size = scanner.nextInt();
        Stack<Long> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            int operation = scanner.nextInt();
            if (operation == 1) {
                long number = scanner.nextInt();
                stack.push(number);
            } else if (operation == 2) {
                stack.pop();
            } else if (operation == 3) {
                System.out.println(Collections.max(stack));
            }

        }

    }


}
