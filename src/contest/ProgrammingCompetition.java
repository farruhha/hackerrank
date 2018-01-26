package contest;

import java.util.Scanner;

public class ProgrammingCompetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = -1;
        String profName = "";
        for (int a0 = 0; a0 < n; a0++) {
            String name = in.next();
            int d = in.nextInt();
            int j = in.nextInt();
            if (Math.abs(d - j) > max) {
                max = Math.abs(d - j);
                profName = name;
            }
        }
        // Write Your Code Here
        System.out.println(profName + " " + max);
        in.close();
    }
}
