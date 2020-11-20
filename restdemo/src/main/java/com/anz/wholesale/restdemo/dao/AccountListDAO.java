package com.anz.wholesale.restdemo.dao;

import java.util.List;

import com.anz.wholesale.restdemo.entity.AccountList;
import com.anz.wholesale.restdemo.entity.TransactionsList;

public interface AccountListDAO 
{
	public List<AccountList> findAllAccounts();

	public List<TransactionsList> findAllTranssactions(int theAccountNumber);

}

