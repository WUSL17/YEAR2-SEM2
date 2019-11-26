/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u172117
 */
public class LinkedList {
    
    class Node {
        private Node next;
        private Object data;
        
        public Node(Object data){
            this.data = data;
        }
        
        public Object getData(){
            return data;
        }
    }
    
     Node head;

    public void append(Object data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(Object data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(Object data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
        }
    }
    
}
