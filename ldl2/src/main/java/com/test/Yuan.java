package com.test;

public class Yuan {
    //圆心  点
    Point p;//圆心点
    int r=13;
 public void panduan(Point op){
    //传入的    我的坐标
    int juli= op.juli(p);//比较 两点之间的距离
     if(juli>r){
         System.out.println("不在○内");
     }else if(juli==r){
         System.out.println("在○上");
     }else{
         System.out.println("在○内");
     }
 }

}
