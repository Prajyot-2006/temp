class Node {
    int val;
    Node next;   // default value null
    Node(int val) {
        this.val = val;
    }
}

public class TraverseLinkedList03 {  // by using only head node

    public static void traverse(Node head) {
        Node temp = head;
        while(temp!=null) {  // when temp==null then loop will end , why null ? coz every linkedlist's last node's reference is null
            System.out.println(temp.val);
            temp = temp.next;   // Very Important a = b , a ke andar b ko dedo 
        }
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

        traverse(a);  // pass by reference - passing the ref value
    }
}
