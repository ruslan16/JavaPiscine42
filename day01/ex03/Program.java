package ex03;

import java.util.UUID;

public class Program {
    public static void main(String[] args) throws TransactionNotFoundException {
        User user = new User(123, "Ivan");
        User user1 = new User(200, "Lev");
        Transaction trans = new Transaction("OUTCOME");
        Transaction trans1 = new Transaction("INCOME");
        Transaction trans2 = new Transaction("INCOME");
        TransactionsLinkedList list = new TransactionsLinkedList();
        Transaction arr[];

        trans.setAmount(-120);
        trans.setIdentifier(UUID.randomUUID());
        trans.setRecipient(user);
        trans.setSender(user1);
        trans1.setAmount(120);
        trans1.setIdentifier(UUID.randomUUID());
        trans1.setRecipient(user);
        trans1.setSender(user1);
        trans2.setAmount(120);
        trans2.setIdentifier(UUID.randomUUID());
        trans2.setRecipient(user);
        trans2.setSender(user1);

        list.addTrans(trans);
        list.addTrans(trans1);
        list.addTrans(trans2);

        Node tmp = list.getHead();

        while (tmp != null){
            System.out.println(tmp.value.identifier);
            tmp = tmp.next;
        }

        list.delTrans(trans.identifier);

        System.out.println("\n");
        Node ll = list.getHead();
        while (ll != null){
            System.out.println(ll.value.identifier);
            ll = ll.next;
        }

        System.out.println("\n");

        arr = list.transToArr();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].identifier);
        }

        list.delTrans("12");
    }
}
