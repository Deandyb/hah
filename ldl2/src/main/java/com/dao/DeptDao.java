package com.dao;

import com.pojo.Dept;

import java.util.List;

public interface DeptDao {
    //��ɾ�Ĳ� ����
    //�б��ѯչʾ
     public List<Dept> search(Dept dept);
     //���淽��
     public  int  addDept(Dept dept);
     //ɾ������
     public  int   delDept(Dept dept);
     //��ѯ��������
     public Dept  getOne(Dept dept);

    //���²�����Ϣ
    public  int  updateDept(Dept dept);
    //����id ����ɾ��
    public int delbat(int[] ids);


}
