package ss11_DSA_Stack_Queue.btap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize=0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enQueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enQueue(5);
//        queue.dequeue();
        queue.enQueue(56);
        queue.enQueue(2);
        queue.enQueue(67);
        queue.dequeue();
//        queue.dequeue();
//        queue.enQueue(24);
//        queue.dequeue();
//        queue.enQueue(98);
//        queue.enQueue(45);
//        queue.enQueue(23);
//        queue.enQueue(435);
//        queue.dequeue();
        System.out.println(queue.currentSize);
        System.out.println(queue.tail);
    }


}
