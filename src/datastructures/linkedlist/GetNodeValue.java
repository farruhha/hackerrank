package datastructures.linkedlist;

public class GetNodeValue {

    class Node {
        int data;
        Node next;
    }


    int GetNode(Node head,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        int size = 0;
        Node node = head;
        while (node != null){
            node = node.next;
            size++;
        }
        int index = size - n;
        int counter = 0;
        Node node2 = head;
        while (node2 != null){
            if (counter == index){
                break;
            }
            node2 = node2.next;
            counter++;
        }

        return node2.data;
    }
}
