package com.xg.controller;

import com.xg.entity.Bank;
import com.xg.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BankController {
    @Resource
    private BankService bankService;
   @RequestMapping("/addBank")
    public ModelAndView addBank(Bank bank){

        ModelAndView mav=new ModelAndView();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

       String createDate=sdf.format(new Date());
       bank.setCreateDate(createDate);
       System.out.println(bank);
       bankService.addBank(bank);
        mav.setViewName("/WEB-INF/jsp/success.jsp");
        return mav;
    }
}
