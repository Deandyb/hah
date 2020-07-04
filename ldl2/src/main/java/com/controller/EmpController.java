package com.controller;

import com.dao.DeptDao;
import com.dao.EmpDao;
import com.pojo.Dept;
import com.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    private EmpDao ed;
    @Autowired
    private DeptDao dd; //部门的dao
    //列表的查询
    @RequestMapping("emp/empsearch.do")
    public String search(Emp emp, Map map){
      List<Emp> list= ed.search(emp);
               map.put("list", list);//员工的列表
      List<Dept> dlist= dd.search(new Dept());//部门的列表
              map.put("dlist", dlist);
               return "empsearch.jsp";

    }
    //准备添加 emp 用户信息
    //先查找所有的部门信息
    @RequestMapping("emp/toempAdd.do")
    public String toempAdd(Map map){
        List<Dept> dlist= dd.search(new Dept());//部门的列表
        map.put("dlist", dlist);
        return  "empAdd.jsp";
    }

    @RequestMapping("emp/addEmp.do")
    public String addEmp(Emp emp,@RequestParam("pic") MultipartFile pic,
                         HttpServletRequest request) throws IOException {
          //文件上传
            if(!pic.isEmpty()){//上传文件
      String path=  request.getSession().getServletContext().getRealPath("upload");
      String filename=pic.getOriginalFilename();
               File f=new File(path+"/"+filename);
                pic.transferTo(f);
               emp.setHead("upload/"+filename);
            }
        int x=   ed.addEmp(emp);
         String message=x<1?"notok":"ok";
          request.setAttribute("message", message);//设置消息
          request.setAttribute("lujing", "empsearch.do");//设置跳转路径

          return "/message.jsp";
    }

    @RequestMapping("emp/delEmp.do")
    public String delEmp(Emp emp ,Map map){
       int x=  ed.delEmp(emp);
        String message=x<1?"notok":"ok";
        map.put("message", message);//设置消息
        map.put("lujing", "empsearch.do");//设置跳转路径

        return "/message.jsp";
    }

    @RequestMapping("emp/getEmp.do")
    public String getEmp(Emp emp ,Map map){
       Emp e=  ed.getEmp(emp);
       map.put("e", e) ;
       //获取 dlist  部门列表的方法
     List<Dept> dlist=   dd.search(new Dept());
     map.put("dlist", dlist);
      return "updateemp.jsp";
    }

      @RequestMapping("emp/updateEmp.do")
      public String updateEmp(Emp emp,@RequestParam("pic") MultipartFile pic
              ,HttpServletRequest request ) throws IOException {
        //保存文件
        if(!pic.isEmpty()){
           String filename=    pic.getOriginalFilename();
           String path=request.getSession().getServletContext().getRealPath("upload");
              File f=new File(path+"/"+filename);
                pic.transferTo(f);
                emp.setHead("upload/"+filename);
           }
         int x=  ed.updateEmp(emp);
          String message=x<1?"notok":"ok";
          request.setAttribute("message", message);//设置消息
          request.setAttribute("lujing", "empsearch.do");//设置跳转路径

          return "/message.jsp";

      }





    @RequestMapping("shangchuan.do")
    public String shangchuan(@RequestParam("pic") MultipartFile pic,
                             HttpServletRequest request ) throws IOException {
        System.out.println(pic.getOriginalFilename());//获取文件的名称 abc.jpg
        System.out.println(pic.isEmpty());
        if(!pic.isEmpty()){//选择了文件  则进入
          String path=  request.getSession().getServletContext().getRealPath("upload");
            System.out.println("path::::"+path);//e:/abc/bbb/upload
            File f=new File(path+"/"+pic.getOriginalFilename());
                            ////e:/abc/bbb/upload/abc.jpg
           pic.transferTo(f);
        }
        //把图片展示在页面上
           request.setAttribute("tupian", "/upload/"+pic.getOriginalFilename());

          return "shangchuan.jsp";
    }




}
