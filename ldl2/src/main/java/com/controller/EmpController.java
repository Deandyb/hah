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
    private DeptDao dd; //���ŵ�dao
    //�б�Ĳ�ѯ
    @RequestMapping("emp/empsearch.do")
    public String search(Emp emp, Map map){
      List<Emp> list= ed.search(emp);
               map.put("list", list);//Ա�����б�
      List<Dept> dlist= dd.search(new Dept());//���ŵ��б�
              map.put("dlist", dlist);
               return "empsearch.jsp";

    }
    //׼����� emp �û���Ϣ
    //�Ȳ������еĲ�����Ϣ
    @RequestMapping("emp/toempAdd.do")
    public String toempAdd(Map map){
        List<Dept> dlist= dd.search(new Dept());//���ŵ��б�
        map.put("dlist", dlist);
        return  "empAdd.jsp";
    }

    @RequestMapping("emp/addEmp.do")
    public String addEmp(Emp emp,@RequestParam("pic") MultipartFile pic,
                         HttpServletRequest request) throws IOException {
          //�ļ��ϴ�
            if(!pic.isEmpty()){//�ϴ��ļ�
      String path=  request.getSession().getServletContext().getRealPath("upload");
      String filename=pic.getOriginalFilename();
               File f=new File(path+"/"+filename);
                pic.transferTo(f);
               emp.setHead("upload/"+filename);
            }
        int x=   ed.addEmp(emp);
         String message=x<1?"notok":"ok";
          request.setAttribute("message", message);//������Ϣ
          request.setAttribute("lujing", "empsearch.do");//������ת·��

          return "/message.jsp";
    }

    @RequestMapping("emp/delEmp.do")
    public String delEmp(Emp emp ,Map map){
       int x=  ed.delEmp(emp);
        String message=x<1?"notok":"ok";
        map.put("message", message);//������Ϣ
        map.put("lujing", "empsearch.do");//������ת·��

        return "/message.jsp";
    }

    @RequestMapping("emp/getEmp.do")
    public String getEmp(Emp emp ,Map map){
       Emp e=  ed.getEmp(emp);
       map.put("e", e) ;
       //��ȡ dlist  �����б�ķ���
     List<Dept> dlist=   dd.search(new Dept());
     map.put("dlist", dlist);
      return "updateemp.jsp";
    }

      @RequestMapping("emp/updateEmp.do")
      public String updateEmp(Emp emp,@RequestParam("pic") MultipartFile pic
              ,HttpServletRequest request ) throws IOException {
        //�����ļ�
        if(!pic.isEmpty()){
           String filename=    pic.getOriginalFilename();
           String path=request.getSession().getServletContext().getRealPath("upload");
              File f=new File(path+"/"+filename);
                pic.transferTo(f);
                emp.setHead("upload/"+filename);
           }
         int x=  ed.updateEmp(emp);
          String message=x<1?"notok":"ok";
          request.setAttribute("message", message);//������Ϣ
          request.setAttribute("lujing", "empsearch.do");//������ת·��

          return "/message.jsp";

      }





    @RequestMapping("shangchuan.do")
    public String shangchuan(@RequestParam("pic") MultipartFile pic,
                             HttpServletRequest request ) throws IOException {
        System.out.println(pic.getOriginalFilename());//��ȡ�ļ������� abc.jpg
        System.out.println(pic.isEmpty());
        if(!pic.isEmpty()){//ѡ�����ļ�  �����
          String path=  request.getSession().getServletContext().getRealPath("upload");
            System.out.println("path::::"+path);//e:/abc/bbb/upload
            File f=new File(path+"/"+pic.getOriginalFilename());
                            ////e:/abc/bbb/upload/abc.jpg
           pic.transferTo(f);
        }
        //��ͼƬչʾ��ҳ����
           request.setAttribute("tupian", "/upload/"+pic.getOriginalFilename());

          return "shangchuan.jsp";
    }




}
