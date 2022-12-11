package com.pan.dao;

import com.pan.pojo.Major;

import java.util.List;

public interface MajorMapper {
    List<Major> qureyByCollegeCode(Integer collegeCode);
}
