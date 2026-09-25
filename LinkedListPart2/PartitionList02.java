class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class PartitionList02 {
    public static void main(String[] args) {

        // 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(5);
        Node n6 = new Node(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Node head = n1;
        int x = 3;

        Node a = new Node(-1);
        Node a1 = a;
        Node b = new Node(-1);
        Node b1 = b;
        Node temp = head;

        while(temp != null) {
            if(temp.val < x) {
                a1.next = temp;
                a1 = a1.next;
            }
            else {
                b1.next = temp;
                b1 = b1.next;
            }
            temp = temp.next;
        }

        b1.next = null;
        a1.next = b.next;

        Node ans = a.next;

        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}