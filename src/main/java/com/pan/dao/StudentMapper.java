package com.pan.dao;

import com.pan.pojo.Student;
import com.pan.vo.StudentVo;

import java.util.List;

public interface StudentMapper {
    public List<StudentVo> querystudent(StudentVo studentVo);
    public Student queryStuentBySno(String sno);
    public int deleteById(Integer id);
}
