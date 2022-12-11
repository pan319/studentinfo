package com.pan.service.iml;

import com.pan.dao.MenuMapper;
import com.pan.pojo.Menu;
import com.pan.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    public List<Menu> findMenuList() {
        return menuMapper.findMenuList();
    }
}
