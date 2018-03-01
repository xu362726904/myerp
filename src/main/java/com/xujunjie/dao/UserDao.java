package com.xujunjie.dao;

import com.xujunjie.entity.User;

import java.util.List;

public interface UserDao {
    void insert(User user);

    User get(Integer id);

    void update(User user);

    void delete(Integer id);

    List<User> findList(User user);
}
