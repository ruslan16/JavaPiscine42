package ex00;

public class Program {
    public static void main(String[] args) {
        User user = new User(120, "Ivan", 11);
        User newUser = new User(200, "Ruslan", 22);
        Transaction transaction = new Transaction("OUTCOME");

        transaction.setAmount(123);
        System.out.println((transaction.amount + transaction.transCat));
        transaction.setTransCat("INCOME");
        transaction.setAmount(123);
        System.out.println(user.balance + user.name + user.identifier);
        System.out.println(newUser.balance + newUser.name + newUser.identifier);
        System.out.println((transaction.amount + transaction.transCat));
    }
}
