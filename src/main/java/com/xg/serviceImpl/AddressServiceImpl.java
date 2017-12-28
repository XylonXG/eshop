package com.xg.serviceImpl;

import com.xg.entity.Address;
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

    public List<Province> findAllProvince() {
        return addressMapper.findAllProvince();
    }

    public List<City> findAllCityByProvincename(String provincename) {
        return addressMapper.findAllCityByProvincename(provincename);
    }
    /*添加收获地址*/
    public void addAddress(Address address) {
        addressMapper.addAddress(address);
    }
}
