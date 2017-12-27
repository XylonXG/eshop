package com.xg.serviceImpl;

import com.xg.entity.City;
import com.xg.entity.Province;
import com.xg.mapper.AddressMapper;
import com.xg.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressMapper addressMapper;
    /*查询所有的省份*/
    public List<Province> selectAllProvince() {
        return addressMapper.selectAllProvince();
    }
    /*查询所有的地市*/
    public List<City> selectAllCity() {
        return addressMapper.selectAllCity();
    }
}
