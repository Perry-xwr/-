package com.neusoft.elmboot.service;


import com.neusoft.elmboot.po.BVirtualWallet;

public interface BVirtualWalletService {
    public BVirtualWallet getVirtualWalletByBusinessId(Integer businessId);
}
