package examples.day28;

/*
    Example used in the tutorial: https://youtu.be/RmEjHzVRsOA
 */

import java.util.HashSet;
import java.util.Set;

public class User {

    String userName;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUserName, String customPass, int customAge, Set<Integer> orderIDs) {
        this.userName = customUserName;
        this.password = customPass;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args) throws Exception {
        Set a = new HashSet();
        a.add(1212);
        User kat = new User("blondiebytes", "hello", 10, a);
    }

}
