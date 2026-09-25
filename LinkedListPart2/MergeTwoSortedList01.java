class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedList01 {
    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);

        a.next = b;
        b.next = c;

        // List 2: 2 -> 4 -> 6
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(6);

        d.next = e;
        e.next = f;

        Node list1 = a;
        Node list2 = d;

        Node d1 = new Node(-1);
        d1.next = list1;
        Node t = d1;
        Node i = list1;
        Node j = list2;

        while(i!=null && j!=null) {
            if(i.val<j.val) {
                t.next = i;
                t = i;
                i = i.next;
            }
            else {
                t.next = j;
                t = j;
                j = j.next;
            }
        }

        if(i==null) {
            t.next = j;
        }
        else {  // j is null
            t.next = i;
        }

        Node ans = d1.next;

        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}