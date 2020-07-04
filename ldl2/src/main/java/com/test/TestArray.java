package com.test;

public class TestArray {
    public static void main(String[] args) {
               //F0
         int [] ages=new int[2];
              ages[0]=22;
              ages[1]=23;
       //int [] ages={22,23};
        //     F0
        int [] aa=ages;
              aa[0]=34;
              aa[1]=44;
        System.out.println(ages[0]);//
        System.out.println(aa[0]);//
      // 在不引入第三变量的情况下 实现两个元素交换
        int  a=18;
        int  b=23;
         a=a+b;  //a 和
         b=a-b;  // 和-b  -->a
         a=a-b;  // 和-a-->b
     //引入第三个变量
      /* int  tmp=a;
         a=b;
         b=tmp;*/
        System.out.println(a);
        System.out.println(b);



    }
}
