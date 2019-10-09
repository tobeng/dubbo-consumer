package com.tobeng.dubbo.service.impl;

import com.tobeng.dubbo.producer.service.OrderService;
import com.tobeng.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * 测试实现
 *
 * @author yaorui
 * @date 2019-10-09 11:24
 **/
@Service
public class TestServiceImpl implements TestService {

    @Reference
    private OrderService orderService;

    @Override
    public String getMessage(String id) {
        return orderService.getOrderMessage(id);
    }
}
