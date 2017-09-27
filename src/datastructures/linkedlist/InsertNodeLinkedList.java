package datastructures.linkedlist;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class InsertNodeLinkedList {


    /*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  */
  class Node {
     int data;
     Node next;
  }

    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node newNode = new Node();
        newNode.data = data;

        if(position  == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }

        int counter = 0;
        Node currentNode  = head;
        while(counter<position-1){
            counter++;
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        head = currentNode;
        return head;


    }
}
