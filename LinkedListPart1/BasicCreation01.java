class Node {
    int val;
    Node next;   // default value null
}

public class BasicCreation01 {
    public static void main(String[] args) {
        // 10->20->30->40->50
        Node a = new Node();
        a.val = 10;
        Node b = new Node();
        b.val = 20;
        Node c = new Node();
        c.val = 30;
        Node d = new Node();
        d.val = 40;
        Node e = new Node();
        e.val = 50;

        

        // Before connecting/linking this is what we get
        System.out.println(a.next);  // b
        System.out.println(b.next);  // c


        // Connect karenga (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.next);  // after connection , it contains some reference value this is b's reference value
        System.out.println(b.next);  // this is c's reference value

    }
}
