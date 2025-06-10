package org.example.Service;

import org.example.Dao.UserDao;
import org.example.Entity.User;

import java.util.List;

public class UserService {
    private UserDao UserDao;

    public UserService() {
        UserDao = new UserDao();
    }

    public void createUser(String name, String email, int age) {
        User user = new User(name, email, age);
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);
        UserDao.save(user);
    }

    public User getUser(Long id) {
        return UserDao.get(id);
    }

    public List<User> getAllUsers() {
        return UserDao.getAll();
    }

    public void updateUser(User user) {
        UserDao.update(user);
    }

    public void deleteUser(Long id) {
        UserDao.delete(id);
    }
}

