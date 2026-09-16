class Node {  // user defined data type
    int val;
    Node next;   // default value null
    Node(int val) {
        this.val = val;
    }
}

class Linkedlist {  // user defined data structure
    Node head;  // null
    Node tail;  // null
    int size;

    void addAtTail(int val) {
        Node temp = new Node(val);
        if(tail==null) {
            // then make head = tail = temp
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if(head==null) {
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;
    } 

    void display() {
        if(head==null) return;
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

public class LinkedListClass06 {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(100);
        ll.addAtTail(200);
        ll.addAtTail(300);
        ll.addAtTail(400);
        ll.display();
        System.out.println();

        ll.addAtHead(80);
        ll.display();
        System.out.println();

        ll.deleteAtHead();
        ll.display();
        System.out.println();
        System.out.println(ll.size);
        
    }
}
