package org.example.Dao;

import org.example.Entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDao {
    private final Session session;

    public UserDao() {
            session = new Configuration().configure().buildSessionFactory().openSession();
    }

    public void save(User user) {
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(user);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public User get(Long id) {
        try {
            return session.get(User.class, id);
        } catch (NullPointerException e){
            e.printStackTrace();
            return null;
        }
    }

    public List<User> getAll() {
        return session.createQuery("from User", User.class).list();
    }

    public void update(User user) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(user);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public void delete(Long id) {
        Transaction transaction = session.beginTransaction();
        try {
            User user = get(id);
            session.delete(user);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
}
