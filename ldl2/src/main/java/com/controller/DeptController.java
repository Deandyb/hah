package com.controller;

import com.dao.DeptDao;
import com.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class DeptController {
    @Autowired
    private DeptDao dd;
    //��ѯ����
    @RequestMapping("deptSearch.do")
    public String deptSearch(Dept dept , Map map){
      List<Dept> list= dd.search(dept);
         map.put("list", list);
         return  "deptsearch.jsp";
    }


    @RequestMapping("addDept.do")
    public String addDept(Dept dept,Map map){
        //���� dao ����ӷ���
       int x=  dd.addDept(dept);
        System.out.println("deptno:::"+dept.getDeptno());
        System.out.println("��Ӱ��ļ�¼����"+x);
        String message=x<1?"notok":"ok";
        // return "deptSearch.do";
          //�����ɹ���  ��ת�� message.jsp ������Ϣ������ʾ
         // 5����֮��  �Զ���ת��ĳ��ҳ��
         //��� ·������
          map.put("lujing", "deptSearch.do");
        return "message.jsp";

    }

    @RequestMapping("delDept.do")
    public String delDept(Dept dept,Map map){
        int x=  dd.delDept(dept);
        String message=x<1?"notok":"ok";
        map.put("lujing", "deptSearch.do");
        return "message.jsp";
}



    @RequestMapping("edit.do")
    public String edit(Dept dept ,Map map){
       Dept d=dd.getOne(dept);//ͨ��id ��ȡdept������Ϣ
           map.put("d", d);
           return "updateDept.jsp";
        }

        @RequestMapping("updateDept.do")
        public String update(Dept dept ,Map map){
        int x=  dd.updateDept(dept);
            String message=x<1?"notok":"ok";
            map.put("lujing", "deptSearch.do");
            return "message.jsp";
        }

        @RequestMapping("delbat.do")
        public String delbat(int[] ids,Map map){
            int x=dd.delbat(ids);
            String message=x<1?"notok":"ok";
            map.put("lujing", "deptSearch.do");
            return "message.jsp";
        }



}
