package com.xujunjie.service;

import com.xujunjie.dao.UserDao;
import com.xujunjie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUser(Integer id) {
        return userDao.get(id);
    }
}
