package by.naumenko.service;

import by.naumenko.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserById(Long id);

    void removeUser(Long id);

    void updateUser(User user);

    void addUser(User user);
}
