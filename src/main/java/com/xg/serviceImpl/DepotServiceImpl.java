package com.xg.serviceImpl;

import com.xg.entity.Depot;
import com.xg.entity.Page;
import com.xg.mapper.DepotMapper;
import com.xg.service.DepotService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service("depotService")
public class DepotServiceImpl implements DepotService {
    @Resource
    private DepotMapper depotMapper;
   /*添加仓库*/
    public void addDepot(Depot depot) {
        depotMapper.addDepot(depot);
    }
    /*分页查看仓库信息*/
    public List<Depot> searchDepotList(Page paramPage) {
        return depotMapper.searchDepotList(paramPage);
    }

    public List<Depot> getDepotBycondtion(Page paramPage) {
        return depotMapper.getDepotBycondtion(paramPage);
    }

    public Integer searchDepotTotalCount(Page paramPage) {
        return depotMapper.searchDepotTotalCount(paramPage);
    }

    public Integer deleteDepot(Integer paramInteger) {
        return depotMapper.deleteDepot(paramInteger);
    }

    public List<Depot> selectDepot() {
        return depotMapper.selectDepot();
    }


}
