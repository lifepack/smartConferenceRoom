package com.kerry.smartconferenceroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kerry.smartconferenceroom.mapper")
public class SmartConferenceRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartConferenceRoomApplication.class, args);
    }

}
