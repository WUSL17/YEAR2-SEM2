public class LinkedListQueue {

    private Node head, tail;

    // Method to add an key to the queue.
    void enqueue(int key) {

        // Create a new LL node
        Node temp = new Node(key);

        // If queue is empty, then new node is front and rear both
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.tail.next = temp;
        this.tail = temp;
    }

    // Method to remove an key from queue.
    Node dequeue() {
        // If queue is empty, return NULL.
        if (this.head == null)
            return null;

        // Store previous front and move front one node ahead
        Node temp = this.head;
        this.head = this.head.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.head == null)
            this.tail = null;
        return temp;
    }

    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }
}

class Demo {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
