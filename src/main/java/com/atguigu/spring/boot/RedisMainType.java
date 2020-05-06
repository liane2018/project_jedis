package com.atguigu.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Liane
 * Date: 2020/05/05
 * Desc: SpringBoot整合redis，
 *      使用springboot提供的模板类redisTemplate创建operation操作对象进行操作，
 *      运用junit注解,springboot自动化配置包
 *      主启动类
 */
@SpringBootApplication
public class RedisMainType {
    public static void main(String[] args) {

        SpringApplication.run(RedisMainType.class,args);


    }
}
