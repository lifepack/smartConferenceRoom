package com.kerry.smartconferenceroom.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kerry.smartconferenceroom.entity.Menus;
import com.kerry.smartconferenceroom.mapper.MenuMapper;
import com.kerry.smartconferenceroom.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menus> implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menus> menus() {
        return menuMapper.findAllMenusWithChildren();
    }
}
