package com.xg.service;

import com.xg.entity.City;
import com.xg.entity.Province;

import java.util.List;

public interface AddressService {
    /*查询所有的省份*/
    public List<Province> selectAllProvince();

    /*查询所有的地市*/
    public List<City> selectAllCity();
}
