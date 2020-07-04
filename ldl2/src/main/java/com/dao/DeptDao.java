package com.dao;

import com.pojo.Dept;

import java.util.List;

public interface DeptDao {
    //增删改查 操作
    //列表查询展示
     public List<Dept> search(Dept dept);
     //保存方法
     public  int  addDept(Dept dept);
     //删除方法
     public  int   delDept(Dept dept);
     //查询单个对象
     public Dept  getOne(Dept dept);

    //更新部门信息
    public  int  updateDept(Dept dept);
    //根据id 批量删除
    public int delbat(int[] ids);


}
