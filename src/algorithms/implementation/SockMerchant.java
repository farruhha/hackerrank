package algorithms.implementation;

import java.util.Scanner;
import java.util.Stack;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        Stack<Integer> stack = new Stack<>();
        stack.add(ar[0]);
        for (int i = 1; i < ar.length; i++) {
            if (stack.contains(ar[i])) {
                stack.removeElement(ar[i]);
            } else {
                stack.add(ar[i]);
            }
        }
        return (ar.length - stack.size()) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
