package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created with size of: " + size);
    }


    // isEmpty() - check if the stack is empty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            return false;
        }
    }

    // push - add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++topOfStack] = value;
            System.out.println("Value " + value + " is pushed to the stack");
        }
    }

    //pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int poppedValue = arr[topOfStack];
            System.out.println("Value" + poppedValue + "is popped off the stack");
            topOfStack--;
            return poppedValue;
        }
        }

        // peek
        public int peek () {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                int peekValue = arr[topOfStack];
                System.out.println("Value" + peekValue + "is the peek value");
                return peekValue;
            }
        }

        // delete
        public void delete( int index){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            if (index < 0 || index > topOfStack) {
                System.out.println("Invalid index");
                return;
            }

            // Create a temporary array to hold elements popped off
            int[] tempArray = new int[topOfStack - index];

            // Pop elements above the index and store them in tempArray
            int tempIndex = 0;
            while (topOfStack > index) {
                tempArray[tempIndex++] = pop();  // Use the existing pop() method
            }

            // Pop the element at the specified index (this effectively deletes it)
            pop();

            // Push the stored elements back onto the stack
            for (int i = tempIndex - 1; i >= 0; i--) {
                push(tempArray[i]);
            }
        }


    }





