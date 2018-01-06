package datastructures.stacks;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

public class BalancedBraket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();


    }

    public static String isBalanced(String bracket) {
        return "";
    }
}
