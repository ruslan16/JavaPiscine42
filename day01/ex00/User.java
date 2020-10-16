package ex00;

import java.util.UUID;

public class User {

    private Integer identifier;
    private String name;
    private Integer balance;

    public User(Integer balance, String name, Integer identifier) {
        if (balance < 0) {
            balance = 0;
        }
        else {
            this.balance = balance;
        }
        this.name = name;
        this.identifier = identifier;
    }

    public int getBalance(){
        return (balance);
    }
}
