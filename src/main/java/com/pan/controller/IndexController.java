package com.pan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController {
    @RequestMapping("/index.html")
    public String index(){
        return "admin/index";
    }
}
