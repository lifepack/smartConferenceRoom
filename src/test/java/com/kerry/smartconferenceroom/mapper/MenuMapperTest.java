package com.kerry.smartconferenceroom.mapper;

import com.kerry.smartconferenceroom.entity.Menus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MenuMapperTest {

    @Resource
    private MenuMapper mapper;

    @Test
    public void menus() {
        System.out.println(mapper.findAllMenusWithChildren());
//        List<Menus> list = mapper.findAllByParentIdMenus(4);
//        System.out.println("list = " + list);
    }
}
