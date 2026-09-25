// for even list - gives leftmost middle node and for odd it gives middle element only
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class LeftMostMiddleElement013 {
    public static void main(String[] args) {
        
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node slow = a;  // head
        Node fast = a;  // head
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }
}
