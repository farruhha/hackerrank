package datastructures.trees;

/**
 * Created by farruhhabibullaev on 9/24/17.
 */
public class InOrderTraverse {

    class Node {
        int data;
        Node left;
        Node right;
    }


    void inOrder(Node root) {
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
    }
}
