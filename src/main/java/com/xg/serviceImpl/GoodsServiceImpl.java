package com.xg.serviceImpl;

import com.xg.entity.Goods;
import com.xg.mapper.GoodsMapper;
import com.xg.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    public void addGood(Goods goods) {
        goodsMapper.addGood(goods);
    }
}
