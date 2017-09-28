package datastructures.linkedlist;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class CompareTwoLinks {

    /*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  */
    class Node {
        int data;
        Node next;
    }

    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node a = headA, b = headB;
        while (a != null && b != null) {
            if (a.data != b.data)
                return 1;

            /* If we reach here, then a and b are not null
               and their data is same, so move to next nodes
               in both lists */
            a = a.next;
            b = b.next;
        }

        // If linked lists are identical, then 'a' and 'b' must
        // be null at this point.
        return (a == null && b == null) ? 1 : 0;

    }
}
