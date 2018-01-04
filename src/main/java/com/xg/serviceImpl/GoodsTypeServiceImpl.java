package com.xg.serviceImpl;

import com.xg.entity.GoodsType;
import com.xg.entity.Page;
import com.xg.mapper.GoodsTypeMapper;
import com.xg.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;
    public List<GoodsType> searchGoodsTypeList(Page paramPage) {
        return goodsTypeMapper.searchGoodsTypeList(paramPage);
    }

    public List<GoodsType> getGoodsTypeBycondtion(Page paramPage) {
        return goodsTypeMapper.getGoodsTypeBycondtion(paramPage);
    }

    public Integer searchGoodsTypeTotalCount(Page paramPage) {
        return goodsTypeMapper.searchGoodsTypeTotalCount(paramPage);
    }

    public Integer deleteGoodsType(Integer paramInteger) {
        return goodsTypeMapper.deleteGoodsType(paramInteger);
    }
}
