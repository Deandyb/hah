package com.test;

public class Ti3 {
    public static void main(String[] args) {
      //����һ��Point���㣩�࣬��װ������������Point���㣩֮��ľ��롣
     // ����һ��Բ�࣬��װ�����жϵ��Ƿ���Բ�ڡ� Բ��  �뾶
      Point p1=new Point();
        p1.x=1;

      Yuan  y=new Yuan();
        Point p2=new Point();
        p2.x=9;
         y.p=p2;
         y.panduan(p1);


    }
}
