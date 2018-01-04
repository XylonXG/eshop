package com.xg.service;

import com.xg.entity.Goods;
import com.xg.entity.GoodsSupplier;
import com.xg.entity.GoodsType;
import com.xg.entity.Page;

import java.util.List;

public interface GoodsService {
    /*商品添加*/
    public void addGood(Goods goods);
    /*分页查询*/
    public abstract List<Goods> searchGoodsList(Page paramPage);

    public abstract List<Goods> getGoodsBycondtion(Page paramPage);

    public abstract Integer searchTotalCount(Page paramPage);

    public abstract Integer deleteGoods(Integer paramInteger);

    /*添加商品类型*/
    public void addGoodsType(GoodsType goodsType);
    /*添加供应商*/
    public void addGoodsSupplier(GoodsSupplier goodsSupplier);
    /*查询商品类型*/
    public List<GoodsType> selectGoodsType();
    /*查询供应商*/
    public List<GoodsSupplier> selectGoodsSupplier();

}
