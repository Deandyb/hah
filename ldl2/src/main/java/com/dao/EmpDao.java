package com.dao;

import com.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //增删改查
    //查询
     public List<Emp> search(Emp emp);
     //进行添加动作
     public int addEmp(Emp emp);

     public int delEmp(Emp emp);

     public Emp getEmp(Emp emp);
    public int updateEmp(Emp emp);

}
