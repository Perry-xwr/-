package com.neusoft.elmboot.service;

import java.util.List;

import com.neusoft.elmboot.po.BankCard;

public interface BankCardService {
	public int saveBankCard(BankCard bankCard);
	public List<BankCard> listBankCardByWalletId(Integer walletId);
}
