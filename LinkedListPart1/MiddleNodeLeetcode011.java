class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class MiddleNodeLeetcode011{
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

        int size = 0;
        Node temp = head;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        int middle = size / 2 + 1;

        for(int i = 0; i < middle - 1; i++) {
            head = head.next;
        }

        System.out.println(head.val);
    }
}