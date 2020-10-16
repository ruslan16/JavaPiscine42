package ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User user = new User(120, "Ivan", 11);
        User newUser = new User(200, "Ruslan", 22);
        Transaction transaction = new Transaction("OUTCOME");

        transaction.setAmount(123);
        System.out.println((transaction.getAmount() + transaction.getTransCat()));
        transaction.setTransCat("INCOME");
        transaction.setAmount(123);
        transaction.setRecipient(user);
        transaction.setSender(newUser);
        System.out.println(user.getBalance());
        System.out.println(newUser.getBalance());
        System.out.println(transaction.getAmount() + transaction.getTransCat());
        transaction.setIdentifier(UUID.randomUUID());
    }
}
