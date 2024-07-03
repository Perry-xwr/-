package com.neusoft.elmboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.elmboot.po.BankCard;

@Mapper
public interface BankCardMapper {
	//添加银行卡
	@Insert("insert into bankcard values(#{cardId},#{userName},#{bankName},#{walletId})")
	public int saveBankCard(BankCard bankCard);
	
	//查询所有银行卡
	@Select("select * from bankcard where walletId=#{walletId}") 
	public List<BankCard> listBankCardByWalletId(Integer walletId);

}
