package ex03;

public class Node {
    Transaction value;
    Node next;
    Node prev;

    public Node(Node prev, Node next, Transaction value){
        this.next = next;
        this.prev = prev;
        this.value = value;
    }
}
