class Node {
    int val;
    Node next;   // default value null
    Node(int val) {
        this.val = val;
    }
}

public class TraverseRecursively04 {

    public static void recursive(Node head) {
        if(head==null) return;
        System.out.println(head.val);
        recursive(head.next);
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        recursive(a);
    }
}
