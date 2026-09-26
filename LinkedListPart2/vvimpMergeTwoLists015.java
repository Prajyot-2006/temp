class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class vvimpMergeTwoLists015 {
    public static void main(String[] args) {
        
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(2);
        Node n6 = new Node(4);
        Node n7 = new Node(6);
        Node n8 = new Node(8);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        Node temp1 = n1;  // head 
        n4.next = null;  // broked
        Node temp2 = n5;
        while(temp1!=null && temp2!=null) {
            Node f1 = temp1.next;
            Node f2 = temp2.next;

            temp1.next = temp2;
            temp2.next = f1;

            temp1 = f1;
            temp2 = f2;
        }
        Node temp = n1;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
