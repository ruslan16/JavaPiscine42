package ex02;

public class UsersArrayList implements UserList {

    User arrUser[] = new User[10];

    User tmpArr[];

    Integer sizeArr = 10;

    Integer countEl = 0;

    public User[] copyArr(User tmpArr[], Integer sizeArr){

        User array[] = new User[sizeArr];

        for (int i = 0; i < tmpArr.length; i++) {
            array[i] = tmpArr[i];
        }

        return (array);
    }

    public void addUser(User user) {

        if (arrUser[sizeArr - 1] != null) {
            tmpArr = new User[sizeArr];
            tmpArr = copyArr(arrUser, sizeArr);
            sizeArr += sizeArr / 2;
            arrUser = new User[sizeArr];
            arrUser = copyArr(tmpArr, sizeArr);
        }

        for (int i = 0; i < sizeArr; i++){
            if (arrUser[i] == null){
                arrUser[i] = user;
                countEl++;
                break;
            }
        }

    }

    public User retrById(Integer id) throws UserNotFoundException {
        for (int i = 0; i < countEl; i++){
            if (arrUser[i].getId() == id){
                return (arrUser[i]);
            }

        }

        throw new UserNotFoundException();
    }

    public User retrByInd(Integer index){
        return (arrUser[index]);
    }

    public int retrNumUs(){
        return (countEl);
    }

    public User[] getArrUser(){
        return (arrUser);
    }
}
