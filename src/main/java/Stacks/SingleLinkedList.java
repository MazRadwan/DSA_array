package Stacks;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Node class
    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Insert a node at the beginning of the linked list
    public void insertInLinkedList(int value, int location) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Delete a node from the linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The linked list does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }
}