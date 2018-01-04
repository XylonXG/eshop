package com.xg.mapper;

import com.xg.entity.GoodsSupplier;
import com.xg.entity.Page;

import java.util.List;

public interface GoodsSupplierMapper {
    /*分页查看供应商*/
    public abstract List<GoodsSupplier> searchGoodsSupplierList(Page paramPage);

    public abstract List<GoodsSupplier> getGoodsSupplierBycondtion(Page paramPage);

    public abstract Integer searchGoodsSupplierTotalCount(Page paramPage);

    public abstract Integer deleteGoodsSupplier(Integer paramInteger);
}
