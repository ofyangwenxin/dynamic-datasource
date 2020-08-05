package com.example.dynamic.mapper;

import com.example.dynamic.DynamicApplication;
import com.example.dynamic.dataobject.UserDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DynamicApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById() {
        UserDo user = userMapper.selectById(1);
        System.out.println(user);
    }
}