// using arraylist - space complexity O(n) and TC as well

import java.util.ArrayList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListArrayList07 {
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

        ArrayList<Node> arr = new ArrayList<>();
        Node temp = head;

        while(temp != null) {
            arr.add(temp);
            temp = temp.next;
        }

        int n = arr.size();

        for(int i = n - 1; i > 0; i--) {
            Node t1 = arr.get(i);
            Node t2 = arr.get(i - 1);
            t1.next = t2;
        }

        if(head == null || head.next == null) {
            System.out.println(head == null ? "null" : head.val);
            return;
        }

        arr.get(0).next = null;

        Node ans = arr.get(n - 1);

        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}