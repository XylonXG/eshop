package com.xg.service;

import com.xg.entity.Address;
import com.xg.entity.City;
import com.xg.entity.Province;

import java.util.List;

public interface AddressService {
    //城市
    public List<Province> findAllProvince();
    //省份
    public List<City> findAllCityByProvincename(String provincename);
      /*添加收获地址*/

    public void addAddress(Address address);
    /*通过用户编号查看用户地址*/
    public Address selectAddressByuserNum(String userNum);
}
