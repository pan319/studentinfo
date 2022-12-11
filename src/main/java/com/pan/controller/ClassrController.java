package com.pan.controller;

import com.pan.pojo.Classr;
import com.pan.service.ClassrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassrController {
    @Resource()
    private ClassrService classrService;
    @RequestMapping("/list")
    @ResponseBody
    public List<Classr> list(Integer majorCode){
        List<Classr> list = classrService.classList(majorCode);
        return list;
    }
}
