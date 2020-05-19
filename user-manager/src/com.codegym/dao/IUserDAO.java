package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLDataException, SQLException;

    public User selectUser(int id);

    public List<User> selectAllUser();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    // Ex.procedures
    public User getUserByID(int id) throws SQLException;

    public void insertUserStore(User user);

    public List<User> searchCountryList(String word);

    public List<User> orderByName();

    public List<User> orderByNameSearch(String key);

    public void addUserTransaction(User user, int[] permision);
}
