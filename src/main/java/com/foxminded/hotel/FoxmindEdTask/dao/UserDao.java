package com.foxminded.hotel.FoxmindEdTask.dao;

import com.foxminded.hotel.FoxmindEdTask.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class UserDao implements IUserDao {
    private Logger logger = Logger.getRootLogger();

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        User user = entityManager.find(User.class, id);
        if (user == null) {
            logger.info("User with id " + id + " is't exist.");
        } else {
            logger.info("Successful found user with id " + id + ".");
        }
        return user;
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
        logger.info("Added user " + user.getName() + " successful!");
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public boolean existsUser(User user) {
        String hql = "FROM users as us where us.name = ?";
        int count = entityManager.createQuery(hql).setParameter(1,user.getName()).getResultList().size();
        return count > 0;
    }
}
