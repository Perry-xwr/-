package com.neusoft.elmboot.service;

import java.util.List;

import com.neusoft.elmboot.po.VirtualWalletTransaction;

public interface VirtualWalletTransactionService {
	
	public int saveTransaction(VirtualWalletTransaction transaction);//插入交易记录
	public List<VirtualWalletTransaction> listTransactionBywalletId(Integer walletId);//查询历史记录

	
}
