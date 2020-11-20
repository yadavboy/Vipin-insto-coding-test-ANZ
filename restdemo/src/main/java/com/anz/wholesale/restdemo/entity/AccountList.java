package com.anz.wholesale.restdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_list")
public class AccountList 
{
//define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_number")
	private int accountNumber;
	
	@Column(name="account_name")
	private String accountName;
	
	@Column(name="account_type")
	private String accountType;
	
	@Column(name="balance_date")
	private Date balanceDate;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="opening_available_balance")
	private double openingAvailableBalance;


//define constructors
	public AccountList()
	{
	}

public AccountList(int accountNumber, String accountName, String accountType, Date balanceDate, String currency,
		double openingAvailableBalance) {
	this.accountNumber = accountNumber;
	this.accountName = accountName;
	this.accountType = accountType;
	this.balanceDate = balanceDate;
	this.currency = currency;
	this.openingAvailableBalance = openingAvailableBalance;
}


//define getters/setters

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAccountName() {
	return accountName;
}

public void setAccountName(String accountName) {
	this.accountName = accountName;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public Date getBalanceDate() {
	return balanceDate;
}

public void setBalanceDate(Date balanceDate) {
	this.balanceDate = balanceDate;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}

public double getOpeningAvailableBalance() {
	return openingAvailableBalance;
}

public void setOpeningAvailableBalance(double openingAvailableBalance) {
	this.openingAvailableBalance = openingAvailableBalance;
}


//define toString()
	
@Override
public String toString() {
	return "AccountList [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
			+ accountType + ", balanceDate=" + balanceDate + ", currency=" + currency + ", openingAvailableBalance="
			+ openingAvailableBalance + "]";
}
	
}
 