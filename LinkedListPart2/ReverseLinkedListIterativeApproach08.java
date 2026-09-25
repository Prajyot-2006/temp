class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListIterativeApproach08{
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

        // iterative approach

        Node f = null;

        Node c = head;

        Node p = null;

        while(c != null) {

            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }

        Node ans = p;

        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}