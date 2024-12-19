package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    private static final Session session = Util.getSessionFactory().openSession();
    Transaction tx = null;

    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
        session.beginTransaction();
        Query query = session.createNativeQuery("CREATE TABLE IF NOT EXISTS users (ID BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20) NOT NULL, lastName VARCHAR(20) NOT NULL, age TINYINT NOT NULL)");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        User user = new User(name, lastName, age);
        Transaction tx = null;
        tx = session.beginTransaction();
        session.save(user);
        tx.commit();
    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
