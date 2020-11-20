package com.anz.wholesale.restdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions_list")
public class TransactionsList {

	//define fields
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="transaction_id")
		
		private int transactionId;
		
		@Column(name="account_number")
		private int accountNumber;
		
		@Column(name="account_name")
		private String accountName;
		
		@Column(name="balance_date")
		private Date balanceDate;
		
		@Column(name="currency")
		private String currency;
		
		@Column(name="debit_amount")
		private double debitAmount;
		
		@Column(name="credit_amount")
		private double creditAmount;
		
		@Column(name="Debit_Credit ")
		private double DebitCredit ;
		
		@Column(name="Transaction_narrative")
		private String transactionNarrative;
		
		//constructors
		public TransactionsList()
		{
			
		}

		public TransactionsList(int transactionId, int accountNumber, String accountName, Date balanceDate,
				String currency, double debitAmount, double creditAmount, double debitCredit,
				String transactionNarrative) {
			super();
			this.transactionId = transactionId;
			this.accountNumber = accountNumber;
			this.accountName = accountName;
			this.balanceDate = balanceDate;
			this.currency = currency;
			this.debitAmount = debitAmount;
			this.creditAmount = creditAmount;
			DebitCredit = debitCredit;
			this.transactionNarrative = transactionNarrative;
		}

		//getters and setters
		public int getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}

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

		public double getDebitAmount() {
			return debitAmount;
		}

		public void setDebitAmount(double debitAmount) {
			this.debitAmount = debitAmount;
		}

		public double getCreditAmount() {
			return creditAmount;
		}

		public void setCreditAmount(double creditAmount) {
			this.creditAmount = creditAmount;
		}

		public double getDebitCredit() {
			return DebitCredit;
		}

		public void setDebitCredit(double debitCredit) {
			DebitCredit = debitCredit;
		}

		public String getTransactionNarrative() {
			return transactionNarrative;
		}

		public void setTransactionNarrative(String transactionNarrative) {
			this.transactionNarrative = transactionNarrative;
		}

		//define toString()
		@Override
		public String toString() {
			return "TransactionsList [transactionId=" + transactionId + ", accountNumber=" + accountNumber
					+ ", accountName=" + accountName + ", balanceDate=" + balanceDate + ", currency=" + currency
					+ ", debitAmount=" + debitAmount + ", creditAmount=" + creditAmount + ", DebitCredit=" + DebitCredit
					+ ", transactionNarrative=" + transactionNarrative + "]";
		}
		
	//
		
}

 
 