package by.naumenko.dao;

import by.naumenko.model.User;
import by.naumenko.model.UserTestNoDB;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserDaoImpl implements USerDao {

    SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUser() {
        Session session = this.sessionFactory.getCurrentSession();
//        List<User> users = session.createQuery("from User").list();
        return UserTestNoDB.getUsers();
    }

    @Override
    public User getUserById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.load(User.class, id);
        return user;
    }

    @Override
    public void removeUser(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.load(User.class, id);
        if (user != null) {
            session.delete(user);
        }
    }

    @Override
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }
}
