package ex02;

public interface UserList {
    public void addUser(User user);
    public User retrById(Integer id) throws Exception, UserNotFoundException;
    public User retrByInd(Integer index);
    public int retrNumUs();
}
