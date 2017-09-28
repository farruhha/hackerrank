package datastructures.linkedlist;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class DeleteANode {

    /*
  Delete Node at a given position in a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  */
    class Node {
        int data;
        Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.

    Node Delete(Node head, int position) {
        // Complete this method

        if (head == null) {
            return null;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return head;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return head;
        Node next = temp.next.next;
        temp.next = next;
        return head;
    }
}
