package com.test;

public class Table {
    //属性
    int leg=4;
    String caizhi="木头";
    //方法
    public void fangdongxi(String dongxi,int num){
        System.out.println("放"+num+"个"+dongxi);
        a();
    }
    public void  a(){
        System.out.println(leg);
        System.out.println("a方法被调用");
    }
    //参数个数不固定肿么办
    //动态参数列表
    public int sum(int ... a){
         int he=0;
          for(int i=0;i<a.length;i++){
             he+=a[i];
          }
           return he;
    }



    public static void main(String[] args) {
        //变量类型  名=值;
         int       i=2;

        Table  t=new Table();
        t.a();
         /*   int[] arr={1,2,3,4,5,6};
            int x=  t.sum(1,2,3,4,5);
        System.out.println("结果是"+x);*/
            // t.fangdongxi("西瓜",2);
              /*t.leg=3;
              t.caizhi="铁";*/
       /* Table  t1=new Table();
        System.out.println(t.leg);
        System.out.println(t.caizhi);
        System.out.println(t1.leg);
        System.out.println(t1.caizhi);*/
    }

}
