package ex03;

public class TransactionsLinkedList implements TransactionsList{
    private Node head;
    private Node tail;
    private Integer size;

    public TransactionsLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void addTrans(Transaction trans) {
        if (size == 0){
            this.head = new Node(null, null, trans);
            this.tail = head;
        }

        else {
            this.tail.next = new Node(this.tail, null, trans);
            this.tail = this.tail.next;
        }

        size++;
    }

    @Override
    public void delTrans(String id) throws TransactionNotFoundException {
        Node tmp = head;

        Node prev;

        Node next;

        if (head.value.identifier == id){
            head = head.next;
            size--;
            return;
        }

        if (head == null){
            return;
        }

        for (int i = 0; i < size; i++){
            if (tmp.value.identifier == id){
                break;
            }
            tmp = tmp.next;
        }

        if (tmp == null){
            throw new TransactionNotFoundException();
        }

        prev = tmp.prev;
        next = tmp.next;

        if (prev != null){
            prev.next = tmp.next;
        }

        if (next != null){
            next.prev = tmp.prev;
        }

        tmp.next = null;
        tmp.prev = null;

        size--;
    }

    @Override
    public Transaction[] transToArr() {
        Transaction[] transArr = new Transaction[size];
        Node tmp = this.head;

        for (int i = 0; i < size; i++){
            transArr[i] = tmp.value;
            tmp = tmp.next;
        }

        return (transArr);
    }

    public Node getHead(){
        return (head);
    }
}
