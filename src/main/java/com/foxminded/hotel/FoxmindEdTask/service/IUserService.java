package com.foxminded.hotel.FoxmindEdTask.service;

import com.foxminded.hotel.FoxmindEdTask.model.User;

import java.util.List;

/**
 * Created by Владислав on 28.02.2018.
 */
public interface IUserService {
    List<User> getAllUsers();
    User getUserById(int id);
    boolean addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    boolean existsUser(User user);
}
