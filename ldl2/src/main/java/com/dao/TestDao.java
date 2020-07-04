package com.dao;

import com.pojo.Test;

import java.util.List;

public interface TestDao {
    public List<Test> getAll();
    public List<Test> search(Test test);
    public void add(Test test);
}
