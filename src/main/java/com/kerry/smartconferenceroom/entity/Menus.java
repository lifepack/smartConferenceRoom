package com.kerry.smartconferenceroom.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Menus {
    @TableId(type = IdType.AUTO)
    private long menuId;
    private String menuPath;
    private String menuTitle;
    private long parentId;
    private String menuIcon;

    // 子级菜单
    private List<Menus> childs;


}
