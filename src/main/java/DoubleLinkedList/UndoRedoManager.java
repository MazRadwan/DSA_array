package DoubleLinkedList;

// Implement an application that supports undo and redo functionality.
// Use a linked list to maintain a sequence of states.
// Each state is stored as a node in the list allowing for easy navigation
// 1<>2<>3<>4<>5

public class UndoRedoManager <T>{
    // undo operation
    //perform operation
    //redo operation

    private class Node {
        private T state;
        private Node prev;
        private Node next;

        // constructor
        private Node (T state) {
            this.state = state;
        }
    }
    private Node currentState;
    // undo operation
    public T undo() {
        if (currentState == null) { // if null that means the list is empty
            System.out.println("No state to undo");
            return null;
        }
        //get the previous state if not null
        Node previousState = currentState.prev; //  create an object of the previous state
        if (previousState == null) {
            System.out.println("Reached the initial state");
            return null;
        } else {
            // update the current state to be the previous state
            currentState = previousState;
        }
        return currentState.state;
    }
    // perform the operation
    public void addState (T newState) {
        // create a new node for the new task
        Node newNode = new Node(newState);

        // set the links for the new node
        newNode.prev = currentState;
        newNode.next = null;

        // Update the next link for the current state
        if (currentState != null) {
            currentState.next = newNode;
        }
        // Update the current to the new state
        currentState = newNode;
    }
    // redo operation
    public T redo() {
        if (currentState == null) {
            System.out.println("current state is null");
            return null;
        }
        if (currentState.next == null) {
            System.out.println("No state to redo");
            return null;
        }
        // get the current state to be the nextState
        currentState = currentState.next;
        return currentState.state;
    }

    public static void main(String[] args) {
        UndoRedoManager<String> undoRedoManager = new UndoRedoManager<>();
        undoRedoManager.addState("State 1");
        undoRedoManager.addState("State 2");
        undoRedoManager.addState("State 3");
        undoRedoManager.addState("State 4");
        undoRedoManager.addState("State 5");
        undoRedoManager.addState("State 6");

        System.out.println("Current State: " + undoRedoManager.currentState.state);

        undoRedoManager.undo();
        System.out.println("Current State: " + undoRedoManager.currentState.state);

        undoRedoManager.undo();
        System.out.println("Current State: " + undoRedoManager.currentState.state);

        undoRedoManager.redo();
        System.out.println("Current Redo State: " + undoRedoManager.currentState.state);

        undoRedoManager.redo();
        System.out.println("Current Redo State: " + undoRedoManager.currentState.state);

    }

}
