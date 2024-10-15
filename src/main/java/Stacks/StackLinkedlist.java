package Stacks;

public class StackLinkedlist {

    SingleLinkedList  linkedList;

    public StackLinkedlist(){
        linkedList = new SingleLinkedList();
    }

    // push method
    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in the stack");
    }

    // isEmpty method
    public boolean isEmpty(){
        if(linkedList.head == null){
            return true;
        } else {
            return false;
        }
    }
    //pop method
    public int pop(){
        int result = -1;
        if (isEmpty()){
            System.out.println("The stack is empty");
        } else {
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }
    //peek method
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    //delete method
    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }

}
