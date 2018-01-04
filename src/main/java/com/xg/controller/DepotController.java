package com.xg.controller;

import com.xg.entity.Depot;
import com.xg.entity.GoodsSupplier;
import com.xg.entity.Page;
import com.xg.service.DepotService;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DepotController {
    @Resource
    private DepotService depotService;
    @RequestMapping("/addDepot")
    public ModelAndView addDepot(String depotName,String province,String city,String isUsed){
        Depot depot=new Depot();
        ModelAndView mav=new ModelAndView();
        StringBuffer sb=new StringBuffer();
        //        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
//       商品编号
        String depotNum=String.valueOf(System.currentTimeMillis())+salt;
//       创建时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        String createTime=sdf.format(new Date());
        //      供应商所在地
        String depotAddress=province+city;

        depot.setDepotNum(depotNum);
        depot.setDepotName(depotName);
        depot.setDepotAddress(depotAddress);
        depot.setIsUsed(isUsed);
        depot.setCreateTime(createTime);

        depotService.addDepot(depot);
        mav.getModel().put("depot",depot);
        mav.setViewName("/WEB-INF/jsp/success.jsp");

        return mav;

    }

    /*分页查询供应商*/
    @RequestMapping("/searchDepotList")
    public ModelAndView searchDepotList(Page page) throws UnsupportedEncodingException
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
        List<Depot> depotList = getDepotListByCondition(page);

        Integer totalCounts = this.depotService.searchDepotTotalCount(page);

        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        p.setTotalPage(totalPages);

        page.setTotalRows(totalCounts.intValue());

        mav.getModel().put("depotList", depotList);

        mav.getModel().put("page", page);
        mav.setViewName("/goods/showDepot.jsp");
        return mav;
    }

    private List<Depot> getDepotListByCondition(Page page)
    {
        List<Depot> depotList = null;
        if (page.getQueryCondition() == null)
        {
            depotList = this.depotService.searchDepotList(page);

            return depotList;
        }
        depotList = this.depotService.getDepotBycondtion(page);


        return depotList;
    }

    @RequestMapping("/deleteDepot")
    public ModelAndView deleteDepot(Integer id) {
        ModelAndView mav=new ModelAndView();
        this.depotService.deleteDepot(id);

        mav.setViewName("/searchDepotList");
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

    /*查看仓库*/
    @RequestMapping("/selectDepot")
    public String  selectDepot(HttpServletResponse response) throws Exception{
        System.out.println("---供应商---");

        List<Depot> depotList=depotService.selectDepot();
        JSONArray goodsTypeJson = new JSONArray(depotList);
        //处理中文乱码，并返回给Ajax值
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;character=utf-8");
        response.getWriter().print(goodsTypeJson);
        return null;
    }
}



