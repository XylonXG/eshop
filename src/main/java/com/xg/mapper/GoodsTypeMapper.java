package com.xg.mapper;

import com.xg.entity.GoodsType;
import com.xg.entity.Page;

import java.util.List;

public interface GoodsTypeMapper {
    /*分页查看商品类型*/
    public abstract List<GoodsType> searchGoodsTypeList(Page paramPage);

    public abstract List<GoodsType> getGoodsTypeBycondtion(Page paramPage);

    public abstract Integer searchGoodsTypeTotalCount(Page paramPage);

    public abstract Integer deleteGoodsType(Integer paramInteger);
}
