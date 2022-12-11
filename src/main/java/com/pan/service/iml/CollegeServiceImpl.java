package com.pan.service.iml;

import com.pan.dao.CollegeMapper;
import com.pan.pojo.College;
import com.pan.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CollegeServiceImpl implements CollegeService {
    @Resource
    private CollegeMapper collegeMapper;
    public List<College> collegeList() {
        List<College> collegerList = collegeMapper.queryCollege();
        return collegerList;
    }
}
