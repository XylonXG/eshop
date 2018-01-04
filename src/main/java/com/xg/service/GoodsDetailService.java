package com.xg.service;

import com.xg.entity.Depot;
import com.xg.entity.DepotGoodsInfo;
import com.xg.entity.Goods;
import com.xg.entity.GoodsDetail;

public interface GoodsDetailService {
    /*添加商品明细*/
    public void addGoodsDetail(GoodsDetail goodsDetail);

    /*查看商品*/
    public Goods selectGoodsBygoodNum(String goodsNum);

    /*查看商品明细*/
    public GoodsDetail selectGoodsDetail(String goodsNum);


    /*添加库存-商品*/
    public void addDepotCount(DepotGoodsInfo depotGoodsInfo);

    /*查看仓库编码*/
    public Depot selectDepotByDepotNum(String depotName);
}
