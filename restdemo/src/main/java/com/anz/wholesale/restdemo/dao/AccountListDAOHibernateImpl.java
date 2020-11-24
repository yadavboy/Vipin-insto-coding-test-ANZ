package com.anz.wholesale.restdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.anz.wholesale.restdemo.entity.AccountList;
import com.anz.wholesale.restdemo.entity.TransactionsList;

@Repository
public class AccountListDAOHibernateImpl implements AccountListDAO {

	//define field for entity manager
	private EntityManager entityManager;
	//set up constructor injection
	
	@Autowired
	public AccountListDAOHibernateImpl(EntityManager theEntityManager)
	{
		entityManager=theEntityManager;
	}
	
	@Override
	public List<AccountList> findAllAccounts() {
		
		//get the current hibernate session
		Session currentSession=entityManager.unwrap(Session.class);
		
		//create a query
		Query<AccountList>theQuery=currentSession.createQuery("from AccountList",AccountList.class);
		
		//execute query and get result list
		List<AccountList> accountList=theQuery.getResultList();
		//return the results
		
 		return accountList;
	}

	@Override
	public List<TransactionsList> findAllTranssactions(int theAccountNumber) {
		//get the current hibernate session
		
 				Session currentSession=entityManager.unwrap(Session.class);
 
				//create a query
		     	Query<TransactionsList>theQuery=currentSession.createQuery("from TransactionsList where account_number=:acn",TransactionsList.class);
			//	List<TransactionsList>transactionsList=currentSession.createQuery("from TransactionsList l where l.account_number=:acn").setParameter("acn",theAccountNumber).list();

				theQuery.setParameter("acn",theAccountNumber);
				
				//execute query and get result list
				//theQuery.executeUpdate();
				List<TransactionsList>transactionsList=theQuery.getResultList();
				//return the results
  		 		return transactionsList;
	}
}

 

