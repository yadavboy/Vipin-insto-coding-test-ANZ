package com.anz.wholesale.restdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.restdemo.entity.AccountList;
import com.anz.wholesale.restdemo.entity.TransactionsList;
import com.anz.wholesale.restdemo.service.AccountListService;

 
@RestController
@RequestMapping("/api")
public class AnzWholesaleRestController {

	private AccountListService accountListService;
	
	//use constructor injection
	@Autowired
	public AnzWholesaleRestController(AccountListService theAccountListService)
	{
		accountListService=theAccountListService;
	}
	
	// expose "/accountList" and return list of Accounts
	@GetMapping("/accountlist")
	public List<AccountList>findAllAccounts(){
		return accountListService.findAllAccounts();
	}
	
	// expose "/transactionList" and return list of transactions
		@GetMapping("/accountlist/{accountNumber}")
		public List<TransactionsList> findAllTransactions(@PathVariable("accountNumber") int theAccountNumber){
 			return accountListService.findAllTransactions(theAccountNumber);
		}
	
}
