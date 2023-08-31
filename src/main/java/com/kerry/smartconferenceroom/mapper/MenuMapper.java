package com.kerry.smartconferenceroom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kerry.smartconferenceroom.entity.Menus;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menus> {

    List<Menus> findAllMenusWithChildren();


    List<Menus> findAllByParentIdMenus(@Param("parentId") Integer parentId);

}
