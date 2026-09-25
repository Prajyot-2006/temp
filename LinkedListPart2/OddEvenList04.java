class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class OddEvenList04 {
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

        Node d1 = new Node(-1);
        Node t1 = d1;
        Node d2 = new Node(-1);
        Node t2 = d2;
        Node temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            if(count % 2 != 0) {
                t1.next = temp;
                t1 = temp;
            }
            else {
                t2.next = temp;
                t2 = temp;
            }
            temp = temp.next;
        }

        t1.next = d2.next;
        t2.next = null;  // d2 ka tail null hua

        Node ans = d1.next;

        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}