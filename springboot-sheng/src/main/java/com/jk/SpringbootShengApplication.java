package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.jk.dao.*")      //扫描mapper层
@EnableTransactionManagement   //开启当前项目的事物管理
public class SpringbootShengApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShengApplication.class, args);
    }

}
