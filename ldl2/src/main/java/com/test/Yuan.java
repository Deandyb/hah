package com.test;

public class Yuan {
    //Բ��  ��
    Point p;//Բ�ĵ�
    int r=13;
 public void panduan(Point op){
    //�����    �ҵ�����
    int juli= op.juli(p);//�Ƚ� ����֮��ľ���
     if(juli>r){
         System.out.println("���ڡ���");
     }else if(juli==r){
         System.out.println("�ڡ���");
     }else{
         System.out.println("�ڡ���");
     }
 }

}
