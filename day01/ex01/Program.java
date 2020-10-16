package ex01;

public class Program {
    public static void main(String[] args) {
        User user = new User(120, "Leo");
        User newUser = new User(2000, "Ruslan");

        System.out.println(user.getId());
        System.out.println(newUser.getId());
    }
}