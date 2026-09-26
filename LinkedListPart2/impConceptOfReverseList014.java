class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class impConceptOfReverseList014 {
    public static void main(String[] args) {
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Node c = n1;
        Node p = null;
        Node fwd = null;
        while(c!=null) {
            fwd  = c.next;
            c.next = p;
            p = c;
            c = fwd;
        }
        Node ans = p;
        while(ans!=null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
        System.out.println();
        // if u try to print n1 which is head of og linkedlsit
        System.out.println(n1.val);
        System.out.println(n1.next);
    }
}
