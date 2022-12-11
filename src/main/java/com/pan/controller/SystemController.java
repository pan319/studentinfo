package com.pan.controller;


import com.google.gson.Gson;
import com.pan.pojo.Student;
import com.pan.service.StudentService;
import com.pan.utils.SystemConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class SystemController {
    Gson gson=new Gson();
    @Resource
    StudentService studentService;

    /**
     * 去到登录页面
     * @return
     */
    @RequestMapping("/login.html")
    public String login(){
        return "admin/login";
    }

    /**
     * 去到登录页面
     * @return
     */
    @RequestMapping("/student/login")
    @ResponseBody
    public String adminlogin(String sno, String password, HttpSession session) {

        Map<String,Object> map = new HashMap<String,Object>();
        Student student = studentService.CheckLogin(sno, password);
        System.out.println(password+":"+sno);
        if (student!=null){
            session.setAttribute(SystemConstant.LOGINUSER,student);
            System.out.println("23");
            map.put(SystemConstant.SUCCESS,true);
        }else {
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"用户名或密码错误，请重新输入！");
        }
        return gson.toJson(map);
    }
    @RequestMapping("/student_manager")
    public String StudentManager(){
        return "admin/student/student_manager";
    }

}
