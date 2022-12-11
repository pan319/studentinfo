package com.pan.controller;

import com.pan.pojo.College;
import com.pan.service.CollegeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/colleges")
@ResponseBody
public class CollegeController {
    @Resource
    private CollegeService collegeService;
    @RequestMapping("/list")
    public List<College> list(){
        List<College> colleges = collegeService.collegeList();
        return colleges;
    }
}
