package com.neusoft.elmboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.elmboot.mapper.VirtualWalletTransactionMapper;
import com.neusoft.elmboot.po.VirtualWalletTransaction;
import com.neusoft.elmboot.service.VirtualWalletTransactionService;

@Service
public class VirtualWalletTransactionServiceImpl implements VirtualWalletTransactionService {
    @Autowired
    private  VirtualWalletTransactionMapper transactionMapper;
  
	@Override
	public int saveTransaction(VirtualWalletTransaction transaction) {
		return transactionMapper.saveTransaction(transaction);
	}

	@Override
	public List<VirtualWalletTransaction> listTransactionBywalletId(Integer walletId) {
		
		return transactionMapper.listTransactionBywalletId(walletId) ;
	}

}
