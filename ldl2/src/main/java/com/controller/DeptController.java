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
    //查询功能
    @RequestMapping("deptSearch.do")
    public String deptSearch(Dept dept , Map map){
      List<Dept> list= dd.search(dept);
         map.put("list", list);
         return  "deptsearch.jsp";
    }


    @RequestMapping("addDept.do")
    public String addDept(Dept dept,Map map){
        //调用 dao 的添加方法
       int x=  dd.addDept(dept);
        System.out.println("deptno:::"+dept.getDeptno());
        System.out.println("受影响的记录行数"+x);
        String message=x<1?"notok":"ok";
        // return "deptSearch.do";
          //操作成功了  跳转到 message.jsp 弹出信息进行提示
         // 5秒中之后  自动跳转到某个页面
         //添加 路径变量
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
       Dept d=dd.getOne(dept);//通过id 获取dept对象信息
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
