package com.foxminded.hotel.FoxmindEdTask.service;

import com.foxminded.hotel.FoxmindEdTask.dao.IUserDao;
import com.foxminded.hotel.FoxmindEdTask.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Владислав on 28.02.2018.
 */
@Service
public class UserService implements IUserService {
    private Logger logger = Logger.getRootLogger();

    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public synchronized boolean addUser(User user) {
        userDao.addUser(user);
           return true;

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public boolean existsUser(User user) {
        return false;
    }
}
