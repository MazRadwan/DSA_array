package Queues;

import java.util.Queue;

public class QueueArray {
    //Enqueue
    private int [] arr;
    private int backOfQueue;
    private int nItems;
    int beginningOfQueue;


    //constructor to initialize the  items

    public QueueArray(int size){
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("The queue is successfully created with size of: " + size);
    }
    //isfull
    public boolean isFull() {
        if (backOfQueue == arr.length - 1) {
            System.out.println("The queue is full");
            return true;
        } else {
            return false;
        }
    }
    //isEmpty
    public boolean isEmpty(){
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            System.out.println("The queue is empty");
            return true;
        } else {
            return false;
        }
    }
    //enqueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            if (isEmpty()) {
                beginningOfQueue = 0;
                backOfQueue++;
                arr[backOfQueue] = value;
                System.out.println("Successfully inserted " + value + " in the queue");
            } else {
                backOfQueue++;
                nItems++;
                arr[backOfQueue] = value;
                System.out.println("Successfully inserted " + value + " in the queue");
            }
        }
    }
        //dequeue
        public int deQueue(int value) {
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            } else {
                int result = arr[beginningOfQueue];
                beginningOfQueue++;
                if (beginningOfQueue > backOfQueue) {
                    beginningOfQueue = backOfQueue = -1;
                }
                nItems--;
                return result;
            }
        }
            //peek
        public int peek(){
            if (!isEmpty()){
                return arr[beginningOfQueue];
            } else {
                System.out.println("The queue is empty");
                return -1;
                }
            }
        }

// An animal shelter , which holds only cats and dogs operates
// on a strictly "first in, first out" basis. People must adopt
// either the "oldest" (based on arrival time) of all animals at
// the shelter, or they can select whether they would prefer a dog
// or a cat (and will receive the oldest animal of that type).
// They cannot select which specific animal they would like.
// Create the data structures to maintain this system and
// implement operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
// You may use the built-in LinkedList data structure.