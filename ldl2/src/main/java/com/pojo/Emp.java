package com.pojo;

public class Emp {
  private Integer     empno;
  private String     ename;
  private String      sex;
    //�ļ��ϴ�   ·��\�ļ�����  <img src="·��\�ļ���" >
  private String      head;//ͷ��
  private Integer     deptno ;
  //����һ��Dept ���͵�����������ʾ��Ա������������Ϣ
   private Dept dept;


    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
