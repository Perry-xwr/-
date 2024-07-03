package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Credit;
import com.neusoft.elmboot.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Credit")
public class CreditController {
    @Autowired
    private CreditService creditService;

    @RequestMapping("/totalNum")
    public Integer getTotalCreditByUserId(Credit credit) throws Exception {
        return creditService.getTotalCreditByUserId(credit.getUserId());
    }

    @GetMapping("/availableCredit")
    public List<Credit> getAvailableCreditByUserId(Credit credit) throws Exception {
        return creditService.getAvailableCreditByUserId(credit.getUserId());
    }

    @GetMapping("/userId")
    public List<Credit> getCreditByUserId(Credit credit) throws Exception {
        return creditService.getCreditByUserId(credit.getUserId());
    }

    @GetMapping("/channelType")
    public List<Credit> getCreditByUserIdAndChannelType(Credit credit) throws Exception {
        return creditService.getCreditByUserIdAndChannelType(credit.getUserId(), credit.getChannelType());
    }

    @PostMapping("/userId")
    public int insertCredit(@RequestBody Credit credit) throws Exception {
        return creditService.insertCredit(credit);
    }

}
