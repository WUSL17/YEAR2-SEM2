public class DoublyLinked {

    DoublyNode head;
    DoublyNode tail;
    Object data;

    DoublyLinked() {
        head = tail = null;
    }

    public static void main(String[] args) {
        DoublyLinked doublyLinked = new DoublyLinked();
        doublyLinked.insertFirst(10);
        doublyLinked.insertFirst(20);
        doublyLinked.insertFirst(30);
        doublyLinked.insertFirst(40);
        doublyLinked.displayList();
        doublyLinked.displayListBackward();
        doublyLinked.insertAfterKey(30, 35);
        doublyLinked.displayList();
        doublyLinked.removeKey(35);
        doublyLinked.displayList();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(Object data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public DoublyNode removeFirst() {
        DoublyNode temp = head;
        if (head.next == null) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        return temp;
    }

    public DoublyNode removeLast() {
        DoublyNode temp = tail;
        if (head.next == null) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        return temp;
    }

    public boolean insertAfterKey(Object key, Object data) {
        DoublyNode temp = head;
        while (temp.data != key) {
            temp = temp.next;
            if (temp == null) {
                return false;
            }
            DoublyNode newNode = new DoublyNode(data);

            if (temp == tail) {
                newNode.next = null;
                tail = newNode;
            } else {
                newNode.next = temp.next;
                temp.next.previous = newNode;
            }
            newNode.previous = temp;
            temp.next = newNode;
        }
        return true;
    }

    public boolean removeKey(Object key) {
        DoublyNode temp = head;
        while (temp.data != key) {
            temp = temp.next;
            if (temp == null) {
                return false;
            }
        }
        if (temp == head)
            head = temp.next;
        else
            temp.previous.next = temp.next;

        if (temp == tail)
            tail = temp.previous;
        else
            temp.next.previous = temp.previous;
        return true;

    }

    public void displayList() {
        System.out.println("List(head ==> tail)");
        DoublyNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }

        System.out.println();
    }

    public void displayListBackward() {
        System.out.println("List(tail ==> head)");
        DoublyNode temp = tail;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.previous;

        }
        System.out.println();
    }

    class DoublyNode {
        Object data;
        DoublyNode previous;
        DoublyNode next;

        public DoublyNode(Object data) {
            this.data = data;
            next = previous = null;
        }

        public DoublyNode(Object data, DoublyNode next, DoublyNode previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public Object getData() {
            return data;
        }

        DoublyNode getNext() {
            return next;
        }

        DoublyNode getPrevoius() {
            return previous;
        }
    }

}
