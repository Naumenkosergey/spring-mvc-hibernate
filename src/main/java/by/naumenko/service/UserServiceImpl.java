package by.naumenko.service;

import by.naumenko.dao.USerDao;
import by.naumenko.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private USerDao userDao;

    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void removeUser(Long id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
