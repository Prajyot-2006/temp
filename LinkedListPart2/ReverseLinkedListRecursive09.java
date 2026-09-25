class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListRecursive09 {

    public static Node reverseList(Node head) {

        if(head == null || head.next == null) {
            return head;
        }

        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        a.next = head;

        return b;
    }

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

        Node ans = reverseList(head);

        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}