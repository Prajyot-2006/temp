class Node {
    int val;
    Node next;   // default value null
    Node(int val) {
        this.val = val;
    }
}

public class LinkedListPointerRules07 {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = c;
        b.next = c;
        System.out.println(c);
        System.out.println(a.next);
        System.out.println(b.next);

        // error 1 node cannot point 2 different nodes 
        c.next = d;
        c.next = e;
        

        


    }
}
