package com.test;

import java.util.Arrays;

public class Ti2 {
    public static void main(String[] args) {
       //	已知一个数组，例如int[] a={5,6,8,0,6,5,0,1,0,56};
        // 写一段代码，要求不使用新数组的情况下，将非0的数字向前移动，将所有的0放非0之后，
        // 移动之后的数据应该如下：a={5,6,8,6,5,1,56,0,0,0};
        int[] a={5,6,8,0,6,5,0,1,0,56};
        // int [] a={5,6,8,0,6,5,0,1,0,56};
        //                 6,5,0,0,1,0,56
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                //循环 向后移动
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
