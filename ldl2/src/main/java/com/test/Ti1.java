package com.test;

import java.util.Scanner;

public class Ti1 {

    public static void main(String[] args) {
       //����������һ��int���͵����ִ洢�Ķ��������溬�ж��ٸ�1
        Scanner sc=new Scanner(System.in);
        System.out.println("����������");
         int num=sc.nextInt();

         //������� ��2 ȡ���� �ж��Ƿ� ��1  ����� �� ����
        // ���������� ���ظ�num
        int count=0;
         while(num>0){
            if(num%2==1){//��ǰλ ��1
              count++;
            }
             num=num/2;
         }
        System.out.println("��"+count+"��1");

    }

}
