package com.pan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.pan.pojo.Student;
import com.pan.service.StudentService;
import com.pan.utils.DataGridViewResult;
import com.pan.utils.SystemConstant;
import com.pan.vo.StudentVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/student")
public class StudentController {
    @Resource
    StudentService studentService;
//    Gson gson;
    @ResponseBody
    @RequestMapping("/list")
    public DataGridViewResult list(StudentVo studentVo){
        //设置分页信息
        PageHelper.startPage(studentVo.getPage(),studentVo.getLimit());
        List<StudentVo> studentlist = studentService.studentlist(studentVo);
        PageInfo<StudentVo> pageInfo= new PageInfo<StudentVo>(studentlist);
//        System.out.println(pageInfo.getList());
        return new DataGridViewResult(pageInfo.getTotal(),pageInfo.getList());
    }
    @RequestMapping("/add.html")
    public String addPage(){
        return "admin/student/student_add";
    }
   /* @RequestMapping("/deleteById")
    public String addPage(int id){
        Map<String,Object> map = new HashMap<String,Object>();
        if(studentService.studentDeleteById(id)>0){
            map.put(SystemConstant.SUCCESS,true);
            map.put(SystemConstant.MESSAGE,"删除成功");
        }else {
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"删除失败");
        }
        return "gson.toJson(map)";
    }*/


}
