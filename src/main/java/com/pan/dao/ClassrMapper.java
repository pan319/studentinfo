package com.pan.dao;

import com.pan.pojo.Classr;

import java.util.List;

public interface ClassrMapper {
    List<Classr> queryClassByMajorCode(Integer majorCode);
}
