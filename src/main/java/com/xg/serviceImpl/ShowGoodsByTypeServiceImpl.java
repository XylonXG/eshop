package com.xg.serviceImpl;

import com.xg.entity.*;
import com.xg.mapper.ShowGoodsByTypeMapper;
import com.xg.service.ShowGoodsByTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("/showGoodsByTypeService")
public class ShowGoodsByTypeServiceImpl implements ShowGoodsByTypeService{
    @Resource
    private ShowGoodsByTypeMapper showGoodsByTypeMapper;
    public List<Goods> selectGoodsByGoodsType(String goodsTypeName) {
        return showGoodsByTypeMapper.selectGoodsByGoodsType(goodsTypeName);
    }

    public GoodsDetail selectGoodsDetailByGoodsNum(String goodsNum) {
        return showGoodsByTypeMapper.selectGoodsDetailByGoodsNum(goodsNum);
    }
    /*单个商品信息*/
    public Goods showGoodsByGoodsNum(String goodsNum) {
        return showGoodsByTypeMapper.showGoodsByGoodsNum(goodsNum);
    }
    /*单个商品详情*/
    public GoodsDetail showGoodsDetailByGoodsNum(String goodsNum) {
        return showGoodsByTypeMapper.showGoodsDetailByGoodsNum(goodsNum);
    }
    /*查看商品库存*/
    public int showGoodsCountByGoodsNum(String goodNum) {
        return showGoodsByTypeMapper.showGoodsCountByGoodsNum(goodNum);
    }
    /*查看供应商信息*/
    public GoodsSupplier showGoodsSupplierByName(String goodsSupplier) {
        return showGoodsByTypeMapper.showGoodsSupplierByName(goodsSupplier);
    }
    /*将商品添加到购物车*/
    public void addGoodsToShoppingCart(ShoppingCart shoppingCart) {
        showGoodsByTypeMapper.addGoodsToShoppingCart(shoppingCart);
    }
    /*显示用户假如购物车的商品*/
    public List<ShoppingCart> showShoppingCartByuserNum(String userNum) {
        return showGoodsByTypeMapper.showShoppingCartByuserNum(userNum);
    }
    /*删除购物车中不中意的商品*/
    public void deleteFromShoppingCartById(int id) {
        showGoodsByTypeMapper.deleteFromShoppingCartById(id);
    }
    /*添加订单*/
    public void addOrder(Order order) {
        showGoodsByTypeMapper.addOrder(order);
    }


}
