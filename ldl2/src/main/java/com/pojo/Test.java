package com.pojo;

public class Test {
    //��ѯ ʱ ����Ϊ�� ���� ʹ�� Integer �������ʹ���
    //���� ���ҳ��û������ ��null ���ݵ���̨dao��
    private Integer id;
    private String name;
    private Integer kaishi;//��ʼλ��
    private Integer jieshu;//����λ��


    public Integer getKaishi() {
        return kaishi;
    }

    public void setKaishi(Integer kaishi) {
        this.kaishi = kaishi;
    }

    public Integer getJieshu() {
        return jieshu;
    }

    public void setJieshu(Integer jieshu) {
        this.jieshu = jieshu;
    }

    //alt+insert  --> getter setter
    public Integer getId() {
        System.out.println("ִ����get id ����");
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
