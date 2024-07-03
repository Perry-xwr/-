package com.neusoft.elmboot.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.neusoft.elmboot.po.BankCard;
import com.neusoft.elmboot.service.BankCardService;

@RestController
@RequestMapping("/BankCard")
public class BankCardController {
	@Autowired
	private BankCardService bankCardService;
	
	@PostMapping (value="/CardId")
	public int saveBankCard(@Valid @RequestBody BankCard bankCard) throws Exception{
		return bankCardService.saveBankCard(bankCard);
	}
	
	@GetMapping("/WalletId")
	public List<BankCard> listBankCardByWalletId(@RequestBody BankCard bankCard) throws Exception{
		return bankCardService.listBankCardByWalletId(bankCard.getWalletId());
	}

}
