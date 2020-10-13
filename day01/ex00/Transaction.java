package ex00;

import java.util.UUID;

public class Transaction {
    public UUID identifier;
    public User recipient;
    public User sender;
    public String transCat;
    public Integer amount;

    public Transaction(String transCat) {
        this.transCat = transCat;
        this.amount = 0;
    }

    public int getAmount(){
        return (amount);
    }

    public void setAmount(Integer amount){
        if ((transCat.equals("INCOME")) && (amount > 0)){
            this.amount = amount;
        }

        else if ((transCat.equals("OUTCOME")) && (amount < 0)){
            this.amount = amount;
        }
    }

    public void setTransCat(String transCat){
        this.transCat = transCat;
    }
}
