package com.pan.service.iml;

import com.google.gson.Gson;
import com.pan.dao.StudentMapper;
import com.pan.pojo.Student;
import com.pan.service.StudentService;
import com.pan.vo.StudentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceIml implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    public Student CheckLogin(String sno, String password) {
        Student student = studentMapper.queryStuentBySno(sno);
        if (student!=null && student.getPassword().equals(password)){
            return student;
        }
        return null;
    }

    public List<StudentVo> studentlist(StudentVo studentVo) {
        List<StudentVo> studentVoList = studentMapper.querystudent(studentVo);
        return studentVoList;
    }

    public int studentDeleteById(int id) {
        int res = studentMapper.deleteById(id);
        return res;
    }

}
