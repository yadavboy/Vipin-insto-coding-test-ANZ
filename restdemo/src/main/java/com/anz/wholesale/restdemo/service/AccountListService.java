package com.anz.wholesale.restdemo.service;

import java.util.List;

import com.anz.wholesale.restdemo.entity.AccountList;
import com.anz.wholesale.restdemo.entity.TransactionsList;

public interface AccountListService {

	public List<AccountList> findAllAccounts();
	
	public List<TransactionsList> findAllTransactions(int theAccountNumber);

}
