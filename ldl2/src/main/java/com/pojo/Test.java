package com.pojo;

public class Test {
    //查询 时 可能为空 所以 使用 Integer 包裹类型处理
    //这样 如果页面没有内容 则按null 传递到后台dao中
    private Integer id;
    private String name;
    private Integer kaishi;//起始位置
    private Integer jieshu;//结束位置


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
        System.out.println("执行了get id 方法");
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
