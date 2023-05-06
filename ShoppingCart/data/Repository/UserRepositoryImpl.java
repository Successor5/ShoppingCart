package data.Repository;

import java.util.ArrayList;

import data.models.user;

public class UserRepositoryImpl implements UserInterface{
ArrayList <user>users=new ArrayList<>();

@Override
public user Save(String name) {
    user newUser = new user();
    users.add(newUser);
    return newUser;
}

@Override
public user delete(String name) {
    for (user u : users) {
        if (u.getName().equals(name)) {
            users.remove(u);
            return u;
        }
    }
    return null;
}
}

   