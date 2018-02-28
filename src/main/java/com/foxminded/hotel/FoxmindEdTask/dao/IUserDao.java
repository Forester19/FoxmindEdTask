package com.foxminded.hotel.FoxmindEdTask.dao;

import com.foxminded.hotel.FoxmindEdTask.model.User;

import java.util.List;

/**
 * Created by Владислав on 28.02.2018.
 */
public interface IUserDao {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    boolean existsUser(User user);
}
