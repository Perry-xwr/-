package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.BVirtualWallet;
import com.neusoft.elmboot.service.BVirtualWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BVirtualWallet")
public class BVirtualWalletController {
    @Autowired
    private BVirtualWalletService bVirtualWalletService;

    @GetMapping("/BusinessId")
    public BVirtualWallet getVirtualWalletByBusinessId(BVirtualWallet bVirtualWallet){
        return bVirtualWalletService.getVirtualWalletByBusinessId(bVirtualWallet.getBusinessId());
    }

}
//测试通过