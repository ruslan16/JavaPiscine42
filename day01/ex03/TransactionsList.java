package ex03;

public interface TransactionsList {
    public void addTrans(Transaction trans);
    public void delTrans(String id) throws TransactionNotFoundException;
    public Transaction[] transToArr();
}
