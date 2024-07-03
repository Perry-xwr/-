package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.BVirtualWalletMapper;
import com.neusoft.elmboot.po.BVirtualWallet;
import com.neusoft.elmboot.service.BVirtualWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BVirtualWalletServiceImpl implements BVirtualWalletService {
    @Autowired
    private BVirtualWalletMapper bVirtualWalletMapper;


    @Override
    public BVirtualWallet getVirtualWalletByBusinessId(Integer businessId) {
        return bVirtualWalletMapper.getVirtualWalletByBusinessId(businessId);
    }
}

