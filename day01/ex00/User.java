package ex00;

import java.util.UUID;

public class User {

    public Integer identifier;
    public String name;
    public Integer balance;

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
}
