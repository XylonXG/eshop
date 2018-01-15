package com.xg.serviceImpl;

import com.xg.entity.Order;
import com.xg.entity.Page;
import com.xg.mapper.OrderMapper;
import com.xg.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("oderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    public List<Order> searchOrderList(Page paramPage) {
        return orderMapper.searchOrderList(paramPage);
    }

    public List<Order> getOrderBycondtion(Page paramPage) {
        return orderMapper.getOrderBycondtion(paramPage);
    }

    public Integer searchOrderTotalCount(Page paramPage) {
        return orderMapper.searchOrderTotalCount(paramPage);
    }

    public Integer deleteOrder(Integer paramInteger) {
        return orderMapper.deleteOrder(paramInteger);
    }
}
