package com.test;

import java.util.Arrays;

public class Ti2 {
    public static void main(String[] args) {
       //	��֪һ�����飬����int[] a={5,6,8,0,6,5,0,1,0,56};
        // дһ�δ��룬Ҫ��ʹ�������������£�����0��������ǰ�ƶ��������е�0�ŷ�0֮��
        // �ƶ�֮�������Ӧ�����£�a={5,6,8,6,5,1,56,0,0,0};
        int[] a={5,6,8,0,6,5,0,1,0,56};
        // int [] a={5,6,8,0,6,5,0,1,0,56};
        //                 6,5,0,0,1,0,56
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                //ѭ�� ����ƶ�
               for(int j=i;j<a.length-1;j++){
                      int tmp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=tmp;
               }
            }
        }
       /* for(int x:a){
            System.out.print(x+",");
        }*/
        System.out.println(Arrays.toString(a));

    }
}
