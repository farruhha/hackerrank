package datastructures.queues;

import datastructures.array.Array;

import java.util.*;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class FixedLength {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < first; i++) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < second; i++) {
            int number = scanner.nextInt();
            ArrayList<Integer> maxList = new ArrayList<>();
            for (int k = 0; k <= list.size() - number; k++) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int j = k; j < number + k; j++) {
                    arrayList.add(list.get(j));

                }
                maxList.add(Collections.max(arrayList));
            }

            System.out.println(Collections.min(maxList));
        }

    }
}
