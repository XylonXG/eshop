package com.xg.controller;

import com.xg.entity.GoodsSupplier;
import com.xg.entity.GoodsType;
import com.xg.entity.Page;
import com.xg.service.GoodsSupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class GoodsSupplierController {
    @Resource
    private GoodsSupplierService goodsSupplierService;
    /*分页查询供应商*/
    @RequestMapping("/searchGoodsSupplierList")
    public ModelAndView searchGoodsSupplierList(Page page) throws UnsupportedEncodingException
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
        List<GoodsSupplier> goodsSupplierList = getGoodsSupplierListByCondition(page);

        Integer totalCounts = this.goodsSupplierService.searchGoodsSupplierTotalCount(page);

        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        p.setTotalPage(totalPages);

        page.setTotalRows(totalCounts.intValue());

        mav.getModel().put("goodsSupplierList", goodsSupplierList);

        mav.getModel().put("page", page);
        mav.setViewName("/goods/showGoodsSupplier.jsp");
        return mav;
    }

    private List<GoodsSupplier> getGoodsSupplierListByCondition(Page page)
    {
        List<GoodsSupplier> goodsSupplierList = null;
        if (page.getQueryCondition() == null)
        {
            goodsSupplierList = this.goodsSupplierService.searchGoodsSupplierList(page);

            return goodsSupplierList;
        }
        goodsSupplierList = this.goodsSupplierService.getGoodsSupplierBycondtion(page);


        return goodsSupplierList;
    }

    @RequestMapping("/deleteGoodsSupplier")
    public ModelAndView deleteGoodsSupplier(Integer id) {
        ModelAndView mav=new ModelAndView();
        this.goodsSupplierService.deleteGoodsSupplier(id);

        mav.setViewName("/searchGoodsTypeList");
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


