package datastructures.array;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/20/17.
 */
public class SparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] stringArray = new String[length];
        for (int i = 0; i < length; i++) {
            stringArray[i] = scanner.next();
        }
        int query = scanner.nextInt();
        String[] queryList = new String[query];
        for (int i = 0; i < query; i++) {
            queryList[i] = scanner.next();
        }

        for (int i = 0; i < queryList.length; i++) {
            int counter = 0;
            for (int j = 0; j < stringArray.length; j++) {
                if (queryList[i].equals(stringArray[j])) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
