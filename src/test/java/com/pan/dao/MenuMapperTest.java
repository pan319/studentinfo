package com.pan.dao;

import com.pan.pojo.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class MenuMapperTest {
//    @Resource MenuMapper menuMapper;
//    @Test
//    public void findMenuList() {
//        List<Menu> list = menuMapper.findMenuList();
//        System.out.println(list);
//    }
}