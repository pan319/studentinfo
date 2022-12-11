package com.pan.controller;

import com.pan.pojo.Major;
import com.pan.service.MajorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/major")
public class MajorController {
    @Resource
    private MajorService majorService;
    @RequestMapping("/list")
    @ResponseBody
    public List<Major> list(Integer collegeCode){
        List<Major> list = majorService.majorList(collegeCode);
        return list;
    }

}
