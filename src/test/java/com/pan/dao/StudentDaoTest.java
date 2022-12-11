package com.pan.dao;

import com.pan.pojo.College;
import com.pan.service.CollegeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class StudentDaoTest {
    @Resource
    StudentMapper studentDao;
    @Test
    public void querystudent() {
        int student = studentDao.deleteById(1);
        System.out.println(student);
    }
    @Resource
    CollegeService collegeService;
    @Test
    public void querystudents() {
        List<College> collegers = collegeService.collegeList();
        System.out.println(collegers);
    }
}