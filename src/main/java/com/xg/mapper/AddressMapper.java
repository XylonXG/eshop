package com.xg.mapper;

import com.xg.entity.Address;
import com.xg.entity.City;
import com.xg.entity.Province;

import java.util.List;

public interface AddressMapper {
    //城市
    public List<Province> findAllProvince();
    //省份
    public List<City> findAllCityByProvincename(String provincename);

    /*添加收获地址*/

    public void addAddress(Address address);
}
