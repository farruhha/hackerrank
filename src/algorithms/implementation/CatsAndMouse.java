package algorithms.implementation;

import java.util.Scanner;

public class CatsAndMouse {
    static String[] catAndMouse(int x, int y, int z) {
        // Complete this function
        String[] strings = new String[1];
        if (Math.abs(x - z) > Math.abs(y - z)) {
            strings[0] = "Cat B";
        } else if (Math.abs(x - z) == Math.abs(y - z)) {
            strings[0] = "Mouse C";
        } else {
            strings[0] = "Cat A";
        }
        return strings;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String[] result = catAndMouse(x, y, z);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
