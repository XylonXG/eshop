package com.xg.mapper;

import com.xg.entity.Order;
import com.xg.entity.Page;

import java.util.List;

public interface OrderMapper {
    /*分页查用户订单*/
    public abstract List<Order> searchOrderList(Page paramPage);

    public abstract List<Order> getOrderBycondtion(Page paramPage);

    public abstract Integer searchOrderTotalCount(Page paramPage);

    public abstract Integer deleteOrder(Integer paramInteger);
}
