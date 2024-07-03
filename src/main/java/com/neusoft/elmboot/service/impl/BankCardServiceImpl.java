package com.neusoft.elmboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.elmboot.mapper.BankCardMapper;
import com.neusoft.elmboot.po.BankCard;
import com.neusoft.elmboot.service.BankCardService;

@Service
public class BankCardServiceImpl implements BankCardService {
	@Autowired
	private BankCardMapper bankCardMapper;

	@Override
	public int saveBankCard(BankCard bankCard) {
		return bankCardMapper.saveBankCard(bankCard);
		
	}

	@Override
	public List<BankCard> listBankCardByWalletId(Integer walletId) {
		return bankCardMapper.listBankCardByWalletId(walletId);
	}
	
	

}
