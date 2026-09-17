class Node {
    int val;
    Node next;   // default value null
    Node(int val) {
        this.val = val;
    }
    Node() {

    }
}

public class BasicCreationUsingConstructor02 {
    public static void main(String[] args) {
        // 10->20->30->40->50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node();   // even though the node's val is default(zero) , it still can print its reference value in short each and every object has its own reference value

        System.out.println(a);   // this prints reference value , when 
        System.out.println("bankai");
        System.out.println(f);

        // Connect karenga (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // lets verify whether nodes are actually linked or not  
        System.out.println(a);   // this prints reference value - Node@2f92e0f4
        System.out.println(b);      // reference Node@28a418fc
        System.out.println(a.next);   // reference Node@28a418fc and it is same as b's reference so that means a's next node is b ✔️
        // ans is same for all 3
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);

        // can also access value
        System.out.println(a.next.next.next.val);   // d.val = 40
    }
}
