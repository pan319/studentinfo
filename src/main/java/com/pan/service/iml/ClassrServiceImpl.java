package com.pan.service.iml;

import com.pan.dao.ClassrMapper;
import com.pan.pojo.Classr;
import com.pan.service.ClassrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassrServiceImpl implements ClassrService {
    @Resource
    private ClassrMapper classrMapper;
    public List<Classr> classList(Integer majorCode) {
        List<Classr> classrList = classrMapper.queryClassByMajorCode(majorCode);
        return classrList;
    }
}
