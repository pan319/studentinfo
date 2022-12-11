package com.pan.service.iml;

import com.pan.dao.MajorMapper;
import com.pan.pojo.Major;
import com.pan.service.MajorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MajorServiceImpl implements MajorService {
    @Resource
    private MajorMapper majorMapper;
    public List<Major> majorList(Integer collegeCode) {
        List<Major> majorList = majorMapper.qureyByCollegeCode(collegeCode);
        return majorList;
    }
}
