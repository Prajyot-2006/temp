class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class deleteMiddleNodeUsingSlowFastApproach012{
    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node head = a;

        Node temp = head;
        Node s = head;
        Node f = head;

        while(f != null && f.next != null) {
            temp = s;
            s = s.next;
            f = f.next.next;
        }

        if(temp.next == null) return;

        temp.next = s.next;

        // display
        temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}