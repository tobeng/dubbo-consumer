package com.tobeng.dubbo.producer.service;

/**
 * 订单 service
 *
 * @author yaorui
 * @date 2019-10-09 11:26
 **/
public interface OrderService {

    /**
     * 获取订单信息
     *
     * @param id 编号
     * @return 信息
     */
    String getOrderMessage(String id);

}
