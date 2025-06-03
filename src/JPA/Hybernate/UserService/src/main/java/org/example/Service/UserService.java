package org.example.Service;

import org.example.Dao.UserDao;
import org.example.Entity.User;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public void createUser(String name, String email, int age) {
        User user = new User(name, email, age);
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);
        userDao.save(user);
    }

    public User getUser(Long id) {
        return userDao.get(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}

