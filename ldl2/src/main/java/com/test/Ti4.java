package com.test;

import java.util.Arrays;
import java.util.List;

public class Ti4 {
  private   Object[] arr;


  private  int index=0;//��ǰ��ŵ�Ԫ������λ��
  private int size=0;//Ԫ�ظ���
    public void add(Object obj){
        //���� �ж� ���� �Ƿ��ܹ��������Ԫ��
        if((size+1)>arr.length){//���� װ������ ����  2��
            System.out.println("������ �³�����"+arr.length*2);
       /*  Object [] arrtmp=new Object[arr.length*2];
           // ��ԭ�е�����Ԫ�ط�����������
            for(int i=0;i<arr.length;i++){//ѭ���̵�
                arrtmp[i]=arr[i];
            }*/
         Object [] arrtmp= Arrays.copyOf(arr, arr.length*2);
            arr=arrtmp;//���µ������ַ���� arr ����
        }
         arr[index]=obj;
          index++;//����+1
          size++;//����+1
    }
    //��Ԫ�ز��뵽ָ����λ��
    public void add(int index,Object obj){
        if(index>=0&&index<arr.length-1){
             if((size+1)>arr.length){//���� װ������ ����  2��){
                 Object [] arrtmp= Arrays.copyOf(arr, arr.length*2);
                 arr=arrtmp;//���µ������ַ���� arr ����
             }
            //����ƶ�Ԫ��
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
        //ɾ��ָ��λ�õ�Ԫ�� �������Ԫ����ǰŲ��

        for(int i=index; i<size-1;i++){
            System.out.println("i::"+i);
            arr[i]=arr[i+1];
        }
        this.index--;
        this.size--;

    }



    public Ti4() {
    index=0;//����λ��
    size=0;//Ԫ�ظ���
   this.arr=new Object[2];//�����ݵ�����
    }

    public void set(int index,Object obj){
        //��Ҫ�Լ��ж�index �ķ�Χ
         arr[index]=obj;

    }
    public boolean contain(Object obj){
         //ѭ���ж� �Ƿ�������Ԫ��
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







        //����һ������  �� ����
        int  index=0;//��ŵ�Ԫ�ص�����λ��
         Object [] arr=new Object[10];
         arr[0]=22;
         arr[1]="abc";
         //1.��������������͵Ŀ��� û������ �ַ������ͣ�
         //2.���鳤����10 �����������ŵ�11 ��Ԫ�� ��ô��?


       // 	����ʵ��һ����̬�����࣬Ϊ�����������·���
       //classDynamicArray{
         /* public void add(Object obj);   //׷��һ����Ԫ��
            public void add(intindex,Objectobj);  //��ĳ��λ�ò���һ��Ԫ��
            public void remove(int index);   //ɾ��ָ��λ�õ�Ԫ��
            public Object get(int index);    //�������������ĳ��λ�õ�Ԫ��
            public void set(intindex,Objectobj);  //�޸�ָ��λ�õ�Ԫ��
            public boolean contain(Object obj);//�Ƿ����ĳ��Ԫ��
        }*/



    }
}
