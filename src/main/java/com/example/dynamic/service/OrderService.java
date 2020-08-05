package com.example.dynamic.service;

import com.example.dynamic.dataobject.OrderDo;
import com.example.dynamic.dataobject.UserDo;
import com.example.dynamic.mapper.OrderMapper;
import com.example.dynamic.mapper.UserMapper;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    private OrderService self() {
        return (OrderService) AopContext.currentProxy();
    }

    public void method01() {
        OrderDo order = orderMapper.selectById(1);
        System.out.println(order);
        UserDo user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Transactional
    public void method02() {
        OrderDo order = orderMapper.selectById(1);
        System.out.println(order);
        UserDo user = userMapper.selectById(1);
        System.out.println(user);
    }
}
