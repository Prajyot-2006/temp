class Node {
    int val;
    Node next;   // default value null
    Node(int val) {
        this.val = val;
    }
}

public class GetValueFn05 {  // by using only head node

    public  static int getValue(Node head , int idx) {  // LinkedList's index doesn't start with 0 but we assumed it starts with 0 here 
        for(int i=0;i<idx;i++) {
            head = head.next;
        }
        return head.val;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int result = getValue(a,2);
        System.out.println(result);
    }

}
