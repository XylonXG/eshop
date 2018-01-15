package com.xg.mapper;

import com.xg.entity.*;

import java.util.List;

public interface ShowGoodsByTypeMapper {
    /*通过商品类型查看商品*/
    public List<Goods> selectGoodsByGoodsType(String goodsTypeName);

    /*查看商品明细*/
    public GoodsDetail selectGoodsDetailByGoodsNum(String goodsNum);

    /*查看商品by GoodsNum*/
    public Goods showGoodsByGoodsNum(String goodsNum);
    /*查看商品详情by GoodsNum*/
    public GoodsDetail showGoodsDetailByGoodsNum(String goodsNum);
    /*查看商品存货量*/
    public int showGoodsCountByGoodsNum(String goodNum);
    /*查看供应商信息*/
    public GoodsSupplier showGoodsSupplierByName(String goodsSupplier);
    /*将商品添加到购物车中*/
    public void addGoodsToShoppingCart(ShoppingCart shoppingCart);
    /*显示用户假如购物车的商品*/
    public List<ShoppingCart> showShoppingCartByuserNum(String userNum);
    /*从购物车中删除不中意的商品*/
    public void deleteFromShoppingCartById(int id);

    /*添加订单*/
    public void addOrder(Order order);

}
