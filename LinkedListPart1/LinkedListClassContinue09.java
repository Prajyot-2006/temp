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

    int search(int val) {
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp!=null) {
            if(temp.val==val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    int getVal(int idx) {
        if(idx<0 || idx>=size) {
            System.out.println("Invalid index!");
            return -1;
        }
        Node temp = head;
        for(int i=0;i<idx;i++) {  // i<4
            temp = temp.next;
        }
        return temp.val;
    }

    void addAtTail(int val) {
        Node temp = new Node(val);
        System.out.println("this is temp 's ref value - " + temp);
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

    void insert(int val , int idx) {
        if(idx<0 || idx>size) {
            System.out.println("Invalid index baby");
            return;
        }
        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else {
            Node temp = head;
            for(int i=1;i<=idx-1;i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    void delete(int idx) {
        if(idx<0 || idx>=size) {
            System.out.println("Invalid index!");
            return;
        }
        if(idx==0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=0;i<idx-1;i++) {  // i<4
            temp = temp.next;
        }
        temp.next = temp.next.next;  // delete
        if(idx == size-1) tail = temp;    // we are deleting tail
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


public class LinkedListClassContinue09 {
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

        System.out.println(ll.search(300));

        ll.insert(76, 2);
        ll.addAtTail(600);
        System.out.println();

        ll.display();
        System.out.println();

        ll.delete(5);
        ll.display();
        System.out.println();
        System.out.println(ll.size);

        System.out.println(ll.getVal(ll.size - 1));
        System.out.println();
        ll.addAtTail(800);
        ll.display();
    }
}