package com.pan.service;

import com.pan.pojo.Menu;

import java.util.List;

public interface MenuService {
    /**
     * 查询所有菜单列表
     * @return
     */
    List<Menu> findMenuList();
}
