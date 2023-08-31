package com.kerry.smartconferenceroom.controller;

import com.kerry.smartconferenceroom.entity.Menus;
import com.kerry.smartconferenceroom.service.MenuService;
import com.kerry.smartconferenceroom.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("list")
    public ResponseUtil menus(){
        return ResponseUtil.ok(menuService.menus());
    }

}
