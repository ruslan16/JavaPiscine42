package ex02;

public class Program {
    public static void main(String[] args) throws UserNotFoundException {
        User user1 = new User(1208, "Egor");
        User user2 = new User(1202, "Anton");
        User user3 = new User(1204, "Kesha");
        User user4 = new User(1206, "Sasha");
        User user5 = new User(12011, "Ruslan");
        User user6 = new User(1205, "Igor");
        User user7 = new User(3202, "Dima");
        UsersArrayList arr = new UsersArrayList();

        arr.addUser(user1);
        arr.addUser(user2);
        arr.addUser(user3);
        arr.addUser(user4);
        arr.addUser(user5);
        arr.addUser(user6);
        arr.addUser(user7);
        arr.addUser(user1);
        arr.addUser(user2);
        arr.addUser(user3);
        arr.addUser(user4);
        arr.addUser(user5);
        arr.addUser(user6);
        arr.addUser(user7);
        for (int i = 0; i < 14; i++){
            System.out.println(arr.arrUser[i].name);
        }
        try {
            System.out.println(arr.retrById(12).name);

        } catch (UserNotFoundException ex ) {

        } System.out.println("UserNotFoundException");
        System.out.println(arr.retrNumUs());
        System.out.println(arr.retrByInd(10).name);
    }
}
