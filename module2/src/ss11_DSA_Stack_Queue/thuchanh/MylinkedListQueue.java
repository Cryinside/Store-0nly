package ss11_DSA_Stack_Queue.thuchanh;

public class MylinkedListQueue {
    private Node head;
    private Node tail;

    public MylinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp= new Node(key);
        if (this.tail==null){
            this.head=this.tail=null;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
    }
    public Node dequeue(){
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
