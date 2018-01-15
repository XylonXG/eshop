package com.xg.controller;

import com.xg.entity.GoodsType;
import com.xg.entity.Order;
import com.xg.entity.Page;
import com.xg.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    private OrderService orderService;
    /*分页查看用户订单*/
    @RequestMapping("/searchOrderList")
    public ModelAndView searchOrderList(Page page) throws UnsupportedEncodingException
    {
        ModelAndView mav=new ModelAndView();
        Page p = page;
        int pageSize = 4;
        p.setPageSize(pageSize);
        int curPage = p.getCurrentPage();
        if (curPage == 0)
        {
            curPage = 1;
            p.setCurrentPage(curPage);
        }
        int startRow = page.getStartRow();
        if (p.getCurrentPage() != 0) {
            startRow = getStartRowBycurrentPage(curPage, pageSize);
        }
        p.setStartRow(startRow);

        String queryCondition = null;
        if (page.getQueryCondition() != null) {
            queryCondition = page.getQueryCondition();
        }
        List<Order> orderList = getOrderListByCondition(page);

        Integer totalCounts = this.orderService.searchOrderTotalCount(page);

        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        p.setTotalPage(totalPages);

        page.setTotalRows(totalCounts.intValue());

        mav.getModel().put("orderList", orderList);

        mav.getModel().put("page", page);
        mav.setViewName("/order/showAllOrder.jsp");
        return mav;
    }

    private List<Order> getOrderListByCondition(Page page)
    {
        List<Order> orderList = null;
        if (page.getQueryCondition() == null)
        {
            orderList = this.orderService.searchOrderList(page);

            return orderList;
        }
        orderList = this.orderService.getOrderBycondtion(page);


        return orderList;
    }

    @RequestMapping("/deleteOrder")
    public ModelAndView deleteOrder(Integer id) {
        ModelAndView mav=new ModelAndView();
        this.orderService.deleteOrder(id);

        mav.setViewName("/searchOrderList");
        return mav;
    }

    public int getStartRowBycurrentPage(int currentPage, int pageSize)
    {
        int startRow = 0;
        if (currentPage == 1) {
            return startRow = 0;
        }
        startRow = (currentPage - 1) * pageSize;

        return startRow;
    }


}
