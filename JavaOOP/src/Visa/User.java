package Visa;

import Visa.dataStorage.AllUsers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 11.08.2016.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2827063400568493923L;
    private String userEmail;
    private List<String> userRequestsIdList = new ArrayList<>();

    public User(String userEmail) {
        this.userEmail = userEmail;
        AllUsers.getAllUsersMap().put(userEmail,this);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public List<String> getUserRequestsIdList() {
        return userRequestsIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userEmail.equals(user.userEmail);

    }

    @Override
    public int hashCode() {
        return userEmail.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmail='" + userEmail + '\'' +
                '}';
    }
}
