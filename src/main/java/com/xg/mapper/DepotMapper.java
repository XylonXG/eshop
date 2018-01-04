package com.xg.mapper;

import com.xg.entity.Depot;
import com.xg.entity.Page;

import java.util.List;

public interface DepotMapper {
    /*添加仓库*/
    public void addDepot(Depot depot);

    /*分页查看仓库*/
    public abstract List<Depot> searchDepotList(Page paramPage);

    public abstract List<Depot> getDepotBycondtion(Page paramPage);

    public abstract Integer searchDepotTotalCount(Page paramPage);

    public abstract Integer deleteDepot(Integer paramInteger);

    /*查看仓库*/
    public List<Depot> selectDepot();
}
