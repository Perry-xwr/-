package com.neusoft.elmboot.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.neusoft.elmboot.po.VirtualWallet;
import com.neusoft.elmboot.po.VirtualWalletTransaction;
import com.neusoft.elmboot.service.VirtualWalletService;

@RestController
@RequestMapping("/VirtualWallet")
public class VirtualWalletController {
	@Autowired
	private VirtualWalletService virtualWalletService;

	//根据用户编号查询虚拟钱包
	@GetMapping("/UserId")
	public VirtualWallet getVirtualWalletByUserId(VirtualWallet virtualWallet){
		return  virtualWalletService.getVirtualWalletByUserId(virtualWallet.getUserId());
	}//测试不通过
	
	// 查询余额
	@GetMapping("/WalletId")
	public BigDecimal getBalance(VirtualWallet virtualWallet)  {
		return virtualWalletService.getBalance(virtualWallet.getWalletId());
	} 
	
	 // 出账（提现）
	@PostMapping("/FromWalletId")
	public int debit(VirtualWallet virtualWallet, BigDecimal amount) {
		return virtualWalletService.debit(virtualWallet.getWalletId(), amount);
	}
	
	// 入账（充值）
	@PostMapping("/ToWalletId")
	public int credit(@RequestBody VirtualWallet virtualWallet, BigDecimal amount) {
		return virtualWalletService.credit(virtualWallet.getWalletId(), amount);
	} 
	
	//转账
	@PostMapping("/WalletId")
	public int transfer(@RequestBody VirtualWalletTransaction transaction, BigDecimal amount,Integer orderId) {
		return virtualWalletService.transfer(transaction.getFromWalletId(), transaction.getToWalletId(), amount, orderId);
		
}
	@PostMapping("/updateAmount")//钱包和订单金额
	public int updateBalance(@RequestBody VirtualWallet virtualWallet, BigDecimal amount){
		Integer walletId=virtualWallet.getWalletId();
		virtualWallet.setBalance(virtualWallet.getBalance().subtract(amount));
		BigDecimal balance=virtualWallet.getBalance();
		return virtualWalletService.updateBalance(walletId,balance);
	}

}
