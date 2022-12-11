package com.pan.service;

import com.pan.pojo.Student;
import com.pan.vo.StudentVo;

import java.util.List;

public interface StudentService {
    public Student CheckLogin(String sno,String password);
    public List<StudentVo> studentlist(StudentVo studentVo);
    public int studentDeleteById(int id);
}
