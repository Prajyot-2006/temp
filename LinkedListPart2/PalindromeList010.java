
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class PalindromeList010 {
    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 2 -> 1
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);

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

        // now break the LL before s and reverse the list from s
        Node p = null;
        Node fwd = null;
        Node c = s;

        while(c != null) {
            fwd = c.next;
            c.next = p;
            p = c;
            c = fwd;
        }

        Node temp1 = head;
        Node temp2 = p;

        boolean ans = true;

        while(temp1 != null && temp2 != null) {
            if(temp1.val != temp2.val) {
                ans = false;
                break;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        System.out.println(ans);
    }
}
