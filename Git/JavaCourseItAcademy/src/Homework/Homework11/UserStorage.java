package Homework.Homework11;

public class UserStorage {

    String[][] usersArr = new String[][]{{"Jan", "Kowalski"}, {"Kazimierz", "Nowak"}, {"Anna", "Baraniak"}, {"Weronika", "Halamala"}};


    public static String getFirstUserName;


    public String getFirstUserName (String[][] usersArr) {
        getFirstUserName = usersArr[0][0]+usersArr[0][1];
        return getFirstUserName;
    }


}
