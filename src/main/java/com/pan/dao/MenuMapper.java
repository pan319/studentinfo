package com.pan.dao;

import com.pan.pojo.Menu;

import java.util.List;

public interface MenuMapper {

    /**
     * 查询所有菜单列表
     * @return
     */
    List<Menu> findMenuList();


}
