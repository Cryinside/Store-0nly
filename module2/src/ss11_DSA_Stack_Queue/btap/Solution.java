package ss11_DSA_Stack_Queue.btap;

public class Solution {


    static void enQueue(Queue q ,int value){
        Node temp=new Node();
        temp.data=value;
        if (q.front==null){
            q.front=q.rear=temp;
        }else {
            q .rear .link = temp;
        }
        q .rear = temp;
        q .rear .link = q .front;
    }

    static int deQueue(Queue q){
        int value = 0;
        if (q.front==null){
            System.out.printf ("Queue is empty");
        }else {
            if (q.front==q.rear){
                value=q.front.data;
                q.front=q.rear=null;
            }else {
                 Node temp=q.front;
                value=temp.data;
                q .front = q .front .link;
                q .rear .link= q .front;
            }
        }
        return value;
    }

    static void displayQueue(Queue q ){
        Node  temp = q .front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp .link != q .front)
        {
            System.out.printf("%d ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%d", temp .data);
    }

    public static void main(String[] args) {
        Queue  q = new Queue();
        q .front = q .rear =  null;
        enQueue(q,14);
        enQueue(q,22);
        enQueue(q,-6);
//        deQueue(q);
        displayQueue(q);
    }
}
