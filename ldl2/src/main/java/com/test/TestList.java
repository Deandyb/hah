package com.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
         list.add("a");
         list.add("b");
         list.add("c");

         for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
         }

        // >>  <<
        LinkedList lk=new LinkedList();
           lk.add("aaa");
    }
}
