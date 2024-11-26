package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    // pre-order traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


//    // level order traversal
//    public void levelOrder(BinaryNode node) {
//        if (node == null) {
//            return;
//        }
//        Queue<BinaryNode> queue = new LinkedList<>();
//        queue.add(node);
//        while (!queue.isEmpty()) {
//            BinaryNode current = queue.poll();
//            System.out.print(current.value + " ");
//            if (current.left != null) {
//                queue.add(current.left);
//            }
//            if (current.right != null) {
//                queue.add(current.right);
//            }
//        }
//    }
// Search method using level order traversal
public void search(String value) {
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        BinaryNode presentNode = queue.remove();
        if (presentNode.value.equals(value)) {
            System.out.println("The value - " + value + " is found in the tree");
            return;
        } else {
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }
    System.out.println("The value - " + value + " is not found in the tree");
}

    // Insert method
    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else if (presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
    // Delete a node from a binary tree
// Given a node implement a delete method to delete a node
// Implement a method to delete and entire binary tree

}
