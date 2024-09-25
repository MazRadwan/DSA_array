package LinkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Create a linked List
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert into a linked list
    //0. if linked list doesn't exist then create it
    //1. Inserting at the beginning
    //2. Inserting at the ending
    //3. Insert anywhere in the LL

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;

    }
    //Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i !=size -1 ){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }
    //Search for a Node
    public boolean searchNode(int nodeValue){
        if (head != null) {
            Node tempNode = head; //tempNode is a pointer
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at index " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //Delete a node from a single linked list
    // if link does not exist
    // if deleting at the beginning
    // if deleting at the end
    // if deleting anywhere in the list

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        } else if (location == 0) { // Deleting at the beginning
            head = head.next;
            size--;
            if (size == 0) {
                tail = null; // If the list becomes empty
            }
        } else if (location >= size || location < 0) { // Invalid location
            System.out.println("Invalid location");
            return;
        } else if (location == size - 1) { // Deleting the last node
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) { // Stop at second t0 last node
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode; // Update the tail
            size--;
        } else { // Deleting from anywhere in the list
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) { // Traverse to the node before node to be deleted
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // Bypass the node to be deleted
            size--;
        }
        System.out.println("Node" + " " + location + " " + "has been deleted");
        System.out.println("The size of the linked list is now " + size);
    }
}
