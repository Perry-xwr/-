package com.neusoft.elmboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.VirtualWalletTransaction;
import com.neusoft.elmboot.service.VirtualWalletTransactionService;

@RestController
@RequestMapping("/VirtualWalletTransaction")
public class VirtualWalletTransactionController {
	@Autowired
	private VirtualWalletTransactionService transactionService;
	
	@GetMapping("/WalletId")
    public List<VirtualWalletTransaction> listTransactionBywalletId(VirtualWalletTransaction transaction){
    	return transactionService.listTransactionBywalletId(transaction.getWalletId());
    }

}
