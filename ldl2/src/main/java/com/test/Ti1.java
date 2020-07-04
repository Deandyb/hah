package com.test;

import java.util.Scanner;

public class Ti1 {

    public static void main(String[] args) {
       //求输入任意一个int类型的数字存储的二进制里面含有多少个1
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
         int num=sc.nextInt();

         //让这个数 和2 取余数 判断是否 是1  如果是 则 计数
        // 将计算后的数 赋回给num
        int count=0;
         while(num>0){
            if(num%2==1){//当前位 是1
              count++;
            }
             num=num/2;
         }
        System.out.println("有"+count+"个1");

    }

}
