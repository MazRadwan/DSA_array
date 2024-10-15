package Queues;

public class Main {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        System.out.println("Is the queue empty? " + queueArray.isEmpty());
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.enQueue(4);
        queueArray.enQueue(5);
        System.out.println(queueArray.peek());

    }
}
