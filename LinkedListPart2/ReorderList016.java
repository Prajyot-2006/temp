class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ReorderList016 {
    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;

        Node s = head;
        Node f = head;

        while(f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        Node temp1 = head;
        Node temp2 = s.next;  // reverse list head node
        s.next = null;

        // reversing list
        Node c = temp2;
        Node p = null;
        Node fwd = null;

        while(c != null) {
            fwd = c.next;
            c.next = p;
            p = c;
            c = fwd;
        }

        temp2 = p;  // vvimp step for merging

        // now merge both lists together -> temp1 and temp2
        while(temp1 != null && temp2 != null) {
            Node f1 = temp1.next;
            Node f2 = temp2.next;

            temp1.next = temp2;
            temp2.next = f1;

            temp1 = f1;
            temp2 = f2;
        }

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
