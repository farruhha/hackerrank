package algorithms.implementation;

import java.util.Scanner;

public class BreakingRecords {
    static int[] breakingRecords(int[] score) {
        // Complete this function
        int increaseCounter = 0;
        int maxValue = score[0];
        int decreaseCounter = 0;
        int minValue = score[0];


        for (int i = 1; i < score.length; i++) {
            if (maxValue < score[i]) {
                maxValue = score[i];
                increaseCounter++;
            } else {
                if (minValue > score[i]) {
                    minValue = score[i];
                    decreaseCounter++;
                }
            }

        }
        return new int[]{increaseCounter, decreaseCounter};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
