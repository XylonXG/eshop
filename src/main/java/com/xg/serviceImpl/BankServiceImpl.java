package com.xg.serviceImpl;

import com.xg.entity.Bank;
import com.xg.mapper.BankMapper;
import com.xg.service.BankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bankService")
public class BankServiceImpl implements BankService {
    @Resource
    private BankMapper bankMapper;
    public void addBank(Bank bank) {
        bankMapper.addBank(bank);
    }
}
