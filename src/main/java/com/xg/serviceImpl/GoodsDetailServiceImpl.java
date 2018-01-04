package com.xg.serviceImpl;

import com.xg.entity.Depot;
import com.xg.entity.DepotGoodsInfo;
import com.xg.entity.Goods;
import com.xg.entity.GoodsDetail;
import com.xg.mapper.GoodsDetailMapper;
import com.xg.service.GoodsDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("goodsDetailService")
public class GoodsDetailServiceImpl implements GoodsDetailService {
    @Resource
    private GoodsDetailMapper goodsDetailMapper;
 /*添加商品明细*/
    public void addGoodsDetail(GoodsDetail goodsDetail) {
        goodsDetailMapper.addGoodsDetail(goodsDetail);
    }
/*查看商品*/
    public Goods selectGoodsBygoodNum(String goodsNum) {
        return goodsDetailMapper.selectGoodsBygoodNum(goodsNum);
    }

    /*查看商品明细*/
    public GoodsDetail selectGoodsDetail(String goodsNum) {
        return goodsDetailMapper.selectGoodsDetail(goodsNum);
    }

    /*添加库存-商品*/
    public void addDepotCount(DepotGoodsInfo depotGoodsInfo) {
        goodsDetailMapper.addDepotCount(depotGoodsInfo);
    }
        /*查看仓库编号*/
    public Depot selectDepotByDepotNum(String depotName) {
        return goodsDetailMapper.selectDepotByDepotNum(depotName);
    }
}
