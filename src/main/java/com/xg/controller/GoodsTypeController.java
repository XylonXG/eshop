package com.xg.controller;

import com.xg.entity.Goods;
import com.xg.entity.GoodsType;
import com.xg.entity.Page;
import com.xg.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class GoodsTypeController {
    @Resource
    private GoodsTypeService goodsTypeService;
    /*分页查询商品类型*/
    @RequestMapping("/searchGoodsTypeList")
    public ModelAndView searchGoodsTypeList(Page page) throws UnsupportedEncodingException
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
        List<GoodsType> goodsTypeList = getGoodsTypeListByCondition(page);

        Integer totalCounts = this.goodsTypeService.searchGoodsTypeTotalCount(page);

        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        p.setTotalPage(totalPages);

        page.setTotalRows(totalCounts.intValue());

        mav.getModel().put("goodsTypeList", goodsTypeList);

        mav.getModel().put("page", page);
        mav.setViewName("/goods/showGoodsType.jsp");
        return mav;
    }

    private List<GoodsType> getGoodsTypeListByCondition(Page page)
    {
        List<GoodsType> goodsTypeList = null;
        if (page.getQueryCondition() == null)
        {
            goodsTypeList = this.goodsTypeService.searchGoodsTypeList(page);

            return goodsTypeList;
        }
        goodsTypeList = this.goodsTypeService.getGoodsTypeBycondtion(page);


        return goodsTypeList;
    }

    @RequestMapping("/deleteGoodsType")
    public ModelAndView deleteGoodsType(Integer id) {
        ModelAndView mav=new ModelAndView();
        this.goodsTypeService.deleteGoodsType(id);

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

    @RequestMapping("/selectAllGoodsType")
    public String selectAllGoodsType(HttpServletRequest request, HttpServletResponse response) throws Exception{

        System.out.println("selectAllGoodsType---------");

        List<GoodsType> goodsTypeList=goodsTypeService.selectAllGoodsType();
        HttpSession session=request.getSession();

        session.setAttribute("goodsTypeList",goodsTypeList);

        request.getRequestDispatcher("/index.jsp").forward(request,response);

        System.out.println(goodsTypeList.size());
        return null;
    }
}
