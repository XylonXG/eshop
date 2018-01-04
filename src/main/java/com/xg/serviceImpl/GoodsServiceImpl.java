package com.xg.serviceImpl;

import com.xg.entity.Goods;
import com.xg.entity.GoodsSupplier;
import com.xg.entity.GoodsType;
import com.xg.entity.Page;
import com.xg.mapper.GoodsMapper;
import com.xg.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    /*添加商品*/
    public void addGood(Goods goods) {
        goodsMapper.addGoods(goods);
    }
/*分页查看*/
    public List<Goods> searchGoodsList(Page paramPage) {
        return goodsMapper.searchGoodsList(paramPage);
    }

    public List<Goods> getGoodsBycondtion(Page paramPage) {
        return goodsMapper.getGoodsBycondtion(paramPage);
    }

    public Integer searchTotalCount(Page paramPage) {
        return goodsMapper.searchTotalCount(paramPage);
    }

    public Integer deleteGoods(Integer paramInteger) {
        return goodsMapper.deleteGoods(paramInteger);
    }
    /*添加商品类型*/
    public void addGoodsType(GoodsType goodsType) {
        goodsMapper.addGoodsType(goodsType);
    }
    /*添加供应商*/
    public void addGoodsSupplier(GoodsSupplier goodsSupplier) {
        goodsMapper.addGoodsSupplier(goodsSupplier);
    }
    /*查询商品类型*/
    public List<GoodsType> selectGoodsType() {
        return goodsMapper.selectGoodsType();
    }
    /*查询供应商*/
    public List<GoodsSupplier> selectGoodsSupplier() {
        return goodsMapper.selectGoodsSupplier();
    }

}
