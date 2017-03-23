package org.launchcode.models;

import java.util.ArrayList;

/**
 * Created by Andrew Bell on 3/22/17.
 */
public class UserData {

    private static ArrayList<User> users = new ArrayList<>();

    public static void add(User user) {
        users.add(user);
    }

    public static ArrayList<User> getAll() {
        return users;
    }

    public static User getById(int id) {
        User foundUser = null;
        for (User candidateUser : users) {
            if (candidateUser.getUserId() == id) {
                foundUser = candidateUser;
            }
        }
        return foundUser;
    }

}
