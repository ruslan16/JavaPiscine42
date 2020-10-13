package ex01;

public class UserIdsGenerator {
    private static UserIdsGenerator userIdsGenerator;
    private static Integer id = 0;

    public static UserIdsGenerator getInstance(){
        if (userIdsGenerator == null){
            userIdsGenerator = new UserIdsGenerator();
        }

        return (userIdsGenerator);
    }

    public int generateId(){
        id += 1;

        return (id);
    }
}
