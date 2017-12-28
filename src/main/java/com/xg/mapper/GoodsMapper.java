package com.xg.mapper;

import com.xg.entity.*;

import java.util.List;

public interface GoodsMapper {
    /*商品添加*/
    public void addGoods(Goods goods);

    /*分页查询*/
    public abstract List<Goods> searchGoodsList(Page paramPage);

    public abstract List<Goods> getGoodsBycondtion(Page paramPage);

    public abstract Integer searchTotalCount(Page paramPage);

    public abstract Integer deleteGoods(Integer paramInteger);

    /*添加商品类型*/

    public void addGoodsType(GoodsType goodsType);
    /*添加供应商*/
    public void addGoodsSupplier(GoodsSupplier goodsSupplier);
}
