package com.xg.serviceImpl;

import com.xg.entity.GoodsSupplier;
import com.xg.entity.Page;
import com.xg.mapper.GoodsSupplierMapper;
import com.xg.service.GoodsSupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsSupplierService")
public class GoodsSupplierServiceImpl implements GoodsSupplierService{
    @Resource
    private GoodsSupplierMapper goodsSupplierMapper;
    /*分页查看供应商*/
    public List<GoodsSupplier> searchGoodsSupplierList(Page paramPage) {
        return goodsSupplierMapper.searchGoodsSupplierList(paramPage);
    }

    public List<GoodsSupplier> getGoodsSupplierBycondtion(Page paramPage) {
        return goodsSupplierMapper.getGoodsSupplierBycondtion(paramPage);
    }

    public Integer searchGoodsSupplierTotalCount(Page paramPage) {
        return goodsSupplierMapper.searchGoodsSupplierTotalCount(paramPage);
    }

    public Integer deleteGoodsSupplier(Integer paramInteger) {
        return goodsSupplierMapper.deleteGoodsSupplier(paramInteger);
    }
}
