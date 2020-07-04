package com.test;

import java.util.Arrays;
import java.util.List;

public class Ti4 {
  private   Object[] arr;


  private  int index=0;//当前存放的元素索引位置
  private int size=0;//元素个数
    public void add(Object obj){
        //扩容 判断 长度 是否能够容纳这个元素
        if((size+1)>arr.length){//扩容 装不下了 扩容  2倍
            System.out.println("扩容了 新长度是"+arr.length*2);
       /*  Object [] arrtmp=new Object[arr.length*2];
           // 将原有的数组元素放入新数组中
            for(int i=0;i<arr.length;i++){//循环短的
                arrtmp[i]=arr[i];
            }*/
         Object [] arrtmp= Arrays.copyOf(arr, arr.length*2);
            arr=arrtmp;//将新的数组地址赋给 arr 属性
        }
         arr[index]=obj;
          index++;//索引+1
          size++;//个数+1
    }
    //将元素插入到指定的位置
    public void add(int index,Object obj){
        if(index>=0&&index<arr.length-1){
             if((size+1)>arr.length){//扩容 装不下了 扩容  2倍){
                 Object [] arrtmp= Arrays.copyOf(arr, arr.length*2);
                 arr=arrtmp;//将新的数组地址赋给 arr 属性
             }
            //向后移动元素
            for(int i=size-1;i>=index;i--){
                    arr[i+1]=arr[i];
            }
             arr[index]=obj;
             this.index++;
             this.size++;
        }
    }


    public Object get(int index){
        return arr[index];
    }

    public  void  remove(int index){
        System.out.println("size:"+size);
        //删除指定位置的元素 将后面的元素向前挪动

        for(int i=index; i<size-1;i++){
            System.out.println("i::"+i);
            arr[i]=arr[i+1];
        }
        this.index--;
        this.size--;

    }



    public Ti4() {
    index=0;//索引位置
    size=0;//元素个数
   this.arr=new Object[2];//存数据的数组
    }

    public void set(int index,Object obj){
        //需要自己判断index 的范围
         arr[index]=obj;

    }
    public boolean contain(Object obj){
         //循环判断 是否包含这个元素
        for(int i=0;i<size;i++){
            if(obj.equals(arr[i])){
              return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Ti4 t=new Ti4();
           t.add("a");
           t.add("b");
           t.add(123);
        t.add(1234);
        t.add(1235);
        t.add(0,"bbb");
        t.remove(2);
        System.out.println(t.size);
        for(int i=0;i<t.size;i++){
            System.out.println(t.get(i));
        }
      boolean b=  t.contain("bbccb");
        System.out.println(b);







        //定义一个数组  放 整数
        int  index=0;//存放的元素的索引位置
         Object [] arr=new Object[10];
         arr[0]=22;
         arr[1]="abc";
         //1.如果放整数的类型的可以 没有问题 字符串类型？
         //2.数组长度是10 如果想往里面放第11 个元素 怎么放?


       // 	自已实现一个动态数组类，为这个类添加如下方法
       //classDynamicArray{
         /* public void add(Object obj);   //追加一个新元素
            public void add(intindex,Objectobj);  //在某个位置插入一个元素
            public void remove(int index);   //删除指定位置的元素
            public Object get(int index);    //根据索引，获得某个位置的元素
            public void set(intindex,Objectobj);  //修改指定位置的元素
            public boolean contain(Object obj);//是否包含某个元素
        }*/



    }
}
