package com.test;

public class Table {
    //����
    int leg=4;
    String caizhi="ľͷ";
    //����
    public void fangdongxi(String dongxi,int num){
        System.out.println("��"+num+"��"+dongxi);
        a();
    }
    public void  a(){
        System.out.println(leg);
        System.out.println("a����������");
    }
    //�����������̶���ô��
    //��̬�����б�
    public int sum(int ... a){
         int he=0;
          for(int i=0;i<a.length;i++){
             he+=a[i];
          }
           return he;
    }



    public static void main(String[] args) {
        //��������  ��=ֵ;
         int       i=2;

        Table  t=new Table();
        t.a();
         /*   int[] arr={1,2,3,4,5,6};
            int x=  t.sum(1,2,3,4,5);
        System.out.println("�����"+x);*/
            // t.fangdongxi("����",2);
              /*t.leg=3;
              t.caizhi="��";*/
       /* Table  t1=new Table();
        System.out.println(t.leg);
        System.out.println(t.caizhi);
        System.out.println(t1.leg);
        System.out.println(t1.caizhi);*/
    }

}
