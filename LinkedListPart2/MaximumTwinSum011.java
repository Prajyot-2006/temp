class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class MaximumTwinSum011 {
    public static void main(String[] args) {

        // 5 -> 4 -> 2 -> 3
        Node n1 = new Node(5);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node head = n1;

        Node s = head;
        Node f = head;

        while(f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        Node p = null;
        Node fwd = null;
        Node c = s;

        while(c != null) {
            fwd = c.next;
            c.next = p;
            p = c;
            c = fwd;
        }

        // now head and p do comparison
        Node temp = head;
        int max = -1110202;

        while(temp != null) {
            if(temp.val + p.val > max) {
                max = temp.val + p.val;
            }

            temp = temp.next;
            p = p.next;
        }

        System.out.println(max);
    }
}
