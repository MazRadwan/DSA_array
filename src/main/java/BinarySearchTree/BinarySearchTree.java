package BinarySearchTree;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree (){
        this.root = null;
    }

    // Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value is successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }
    public void insert (int value){
        root = insert(root, value);
    }

    //preOrder traversal
    public void preOrder(Tree.BinaryNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " "); //root
        preOrder(node.left);
        preOrder(node.right);
    }

    //preorder traversal
    public void inOrder(Tree.BinaryNode node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " "); //root
        inOrder(node.right);
    }

    //postorder traversal
    public void postOrder(Tree.BinaryNode node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " "); //root

    }

    //Level Order
    //search Method
    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in BST");
            return null;
        } else if(node.value == value) {
            System.out.println("Value: " + value + " found in BST");
            return node;
        } else if (value < node.value){
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public static BinaryNode minimumNode (BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    public static BinaryNode maximumNode (BinaryNode root) {
        if (root.right == null) {
            return root;
        } else {
            return maximumNode(root.right);
        }
    }

    //Delete Node
    public BinaryNode deleteNode (BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value not found in the BST");
            return null;
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left !=null && root.right !=null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right  = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }

        }
        return root;
    }

    //delete entire BST
    public void deleteBST(){
        root = null;
        System.out.println("BST has been deleted successfully");
    }
}
