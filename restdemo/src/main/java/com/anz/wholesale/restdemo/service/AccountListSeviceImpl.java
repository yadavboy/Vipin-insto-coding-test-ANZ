package com.anz.wholesale.restdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anz.wholesale.restdemo.dao.AccountListDAO;
import com.anz.wholesale.restdemo.entity.AccountList;
import com.anz.wholesale.restdemo.entity.TransactionsList;

@Service
public class AccountListSeviceImpl implements AccountListService {

	private AccountListDAO accountListDAO;
	
	@Autowired
	public AccountListSeviceImpl(AccountListDAO theAccountListDAO)
	{
		accountListDAO=theAccountListDAO;
	}
	
	@Override
	@Transactional
	public List<AccountList> findAllAccounts() {
 		return accountListDAO.findAllAccounts();
	}

	@Override
	@Transactional
	public List<TransactionsList> findAllTransactions(int theAccountNumber) {
		 
		return accountListDAO.findAllTranssactions(theAccountNumber);
	}

}
