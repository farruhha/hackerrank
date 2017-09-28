package datastructures.queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class TwoStacks {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner  = new Scanner(System.in);
        int size = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < size; i++){
            int operation = scanner.nextInt();
            switch(operation){
                case 1:
                    int element  = scanner.nextInt();
                    queue.offer(element);
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                    System.out.println(queue.element());
            }
        }
    }
}
