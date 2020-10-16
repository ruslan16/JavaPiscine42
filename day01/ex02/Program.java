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
        User user8 = new User(1208, "Egor");
        User user9 = new User(1202, "Anton");
        User user10 = new User(1204, "Kesha");
        User user11 = new User(1206, "Sasha");
        User user12 = new User(12011, "Ruslan");
        User user13 = new User(1205, "Igor");
        User user14 = new User(3202, "Dima");
        UsersArrayList arr = new UsersArrayList();

        arr.addUser(user1);
        arr.addUser(user2);
        arr.addUser(user3);
        arr.addUser(user4);
        arr.addUser(user5);
        arr.addUser(user6);
        arr.addUser(user7);
        arr.addUser(user8);
        arr.addUser(user9);
        arr.addUser(user10);
        arr.addUser(user11);
        arr.addUser(user12);
        arr.addUser(user13);
        arr.addUser(user14);

        User arrUs[] = arr.getArrUser();
        System.out.println(arrUs.length);

        for (int i = 0; arrUs[i] != null; i++){
            System.out.println(arrUs[i].getId());
        }

        System.out.println("\n");
        System.out.println(arr.retrById(11).getId());
        System.out.println(arr.retrByInd(12).getId());
        System.out.println(arr.retrNumUs());
    }
}
