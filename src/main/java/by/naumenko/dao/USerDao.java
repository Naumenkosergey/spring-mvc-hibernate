package by.naumenko.dao;

import by.naumenko.model.User;

import java.util.List;

public interface USerDao {

    List<User> getAllUser();

    User getUserById(Long id);

    void removeUser(Long id);

    void updateUser(User user);

    void addUser(User user);
}
