package ex03;

public class User {

    public Integer id;
    public String name;
    public Integer balance;
    public TransactionsList transactions;

    public User(Integer balance, String name) {
        if (balance < 0) {
            balance = 0;
        }
        else {
            this.balance = balance;
        }
        this.name = name;
        this.id = UserIdsGenerator.getInstance().generateId();
        this.transactions = new TransactionsLinkedList();
    }
}
