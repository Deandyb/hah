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
      // �ڲ������������������� ʵ������Ԫ�ؽ���
        int  a=18;
        int  b=23;
         a=a+b;  //a ��
         b=a-b;  // ��-b  -->a
         a=a-b;  // ��-a-->b
     //�������������
      /* int  tmp=a;
         a=b;
         b=tmp;*/
        System.out.println(a);
        System.out.println(b);



    }
}
