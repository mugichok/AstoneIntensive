package org.example.Dao;

import org.example.Entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDao {
    private Session session;

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
        return session.get(User.class, id);
    }

    public List<User> getAll() {
        return session.createQuery("from Users", User.class).list();
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
            if (user != null) {
                session.delete(user);
                transaction.commit();
            }
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
}
