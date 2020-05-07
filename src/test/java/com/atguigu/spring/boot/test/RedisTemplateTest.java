package com.atguigu.spring.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author: Liane
 * Date: 2020/05/05
 * Desc: SpringBoot整合redis，
 *      使用springboot提供的模板类redisTemplate创建operation操作对象进行操作，
 *      运用junit注解,springboot自动化配置包
 *      测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testStringRedisTemplate(){

        //1.获取Operation对象
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();

        //2.设置值
        operations.set("pig","hengheng");

        //3.获取值
        String pig = operations.get("pig");
        System.out.println(pig);

    }

    @Test
    public void testRedisTemplate(){

        // 1.根据要操作的类型获取Operations对象
        ValueOperations<Object, Object> operations = redisTemplate.opsForValue();

        //2.执行操作
        operations.set("cat","miao");

        System.out.println(operations.get("cat"));

    }

    //Git提交测试
    //Git在分支中提交测试
    //Git在hotfix分支中提交测试
    @Test
    public void testRedisTemplateGet(){
        ValueOperations<Object, Object> operations = redisTemplate.opsForValue();
        Object cat = operations.get("cat");
        System.out.println(cat);


    }

}
