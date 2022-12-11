package com.pan.service;

import com.pan.pojo.Major;

import java.util.List;

public interface MajorService {
    List<Major> majorList(Integer collegeCode);
}
