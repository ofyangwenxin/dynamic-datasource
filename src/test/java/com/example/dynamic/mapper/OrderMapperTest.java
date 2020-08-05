package com.example.dynamic.mapper;

import com.example.dynamic.DynamicApplication;
import com.example.dynamic.dataobject.OrderDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DynamicApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() {
        OrderDo order = orderMapper.selectById(1);
        System.out.println(order);
    }

}
