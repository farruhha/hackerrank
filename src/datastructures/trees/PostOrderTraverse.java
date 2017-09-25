package datastructures.trees;

/**
 * Created by farruhhabibullaev on 9/24/17.
 */
public class PostOrderTraverse {

    class Node {
        int data;
        Node left;
        Node right;
    }



    void postOrder(Node root) {
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
