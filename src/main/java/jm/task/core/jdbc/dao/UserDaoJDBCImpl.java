package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Тут пишем sql код для взаимодействия с БД
/*
public class UserDaoJDBCImpl extends Util implements UserDao {
    Connection connection = getConnection();
    private static final String SQL_CRATE_TABLE = "CREATE TABLE IF NOT EXISTS users (ID BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20) NOT NULL, lastName VARCHAR(20) NOT NULL, age TINYINT NOT NULL)";
    private static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS users";
    private static final String SQL_ADD_USER = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
    private static final String SQL_REMOVE_USER = "DELETE FROM users WHERE id = ?";
    private static final String SQL_GET_USERS = "SELECT * FROM users";
    private static final String SQL_DELETE_USERS = "DELETE FROM users";

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL_CRATE_TABLE);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL_DROP_TABLE);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        User user = new User(name, lastName, age);
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL_ADD_USER);
            ps.setString(1, name);
            ps.setString(2, lastName);
            ps.setByte(3, age);
            ps.executeUpdate();
            System.out.println("User с именем — " + user.getName() + " добавлен в базу данных" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUserById(long id) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL_REMOVE_USER);
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(SQL_GET_USERS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                byte age = rs.getByte("age");
                User user = new User(name, lastName, age);
                user.setId(id);
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    public void cleanUsersTable() {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(SQL_DELETE_USERS);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/