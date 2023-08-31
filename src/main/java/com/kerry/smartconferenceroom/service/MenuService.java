package com.kerry.smartconferenceroom.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kerry.smartconferenceroom.entity.Menus;

import java.util.List;

public interface MenuService extends IService<Menus> {

    List<Menus> menus();
}
