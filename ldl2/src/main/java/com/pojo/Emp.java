package com.pojo;

public class Emp {
  private Integer     empno;
  private String     ename;
  private String      sex;
    //文件上传   路径\文件名称  <img src="路径\文件名" >
  private String      head;//头像
  private Integer     deptno ;
  //定义一个Dept 类型的属性用来表示该员工所属部门信息
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
