package com.dao;

import com.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //��ɾ�Ĳ�
    //��ѯ
     public List<Emp> search(Emp emp);
     //������Ӷ���
     public int addEmp(Emp emp);

     public int delEmp(Emp emp);

     public Emp getEmp(Emp emp);
    public int updateEmp(Emp emp);

}
