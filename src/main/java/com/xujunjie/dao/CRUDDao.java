package com.xujunjie.dao;

import java.util.List;

public interface CRUDDao<T> {
    void insert(T t);

    T get(Integer id);

    List<T> findList(T t);

    void update(T t);

    void delete(Integer id);
}
