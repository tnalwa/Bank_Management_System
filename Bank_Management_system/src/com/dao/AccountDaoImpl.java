package com.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Account;
import com.bean.Customer;
import com.bean.Transactions;

public class AccountDaoImpl implements AccountDao {
	Customer cus = new Customer();

	@Override
	public Account createAcccount(String name, String username, String password, String address, String phoneno,
			String email, String type, String bname) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();

		// getting account id

//		Query q  = ses.createQuery("select nextval('acseq')");
//		List li = q.getResultList();
//		System.out.println(li);
//		System.out.println("#############");
//		long accountno = (long)li.get(0);
//		System.out.println(accountno);

		// getting customer id

//		Query q1  = ses.createQuery("select nextval('cuseq')");
//		List li1 = q1.getResultList();
//		long customerId = (long)li1.get(0);
//		System.out.println(customerId);

		Transaction tx = ses.beginTransaction();
		Account account = new Account(type, name, 0.0, bname);
		Customer customer = new Customer(username, password, address, phoneno, email, account);
		ses.save(account);
		ses.save(customer);
		tx.commit();
		System.out.println("Person Saved !");

		ses.close();
		sf.close();

		return account;
	}

	@Override
	public String deposit(Account ac, String money) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		double amount = Double.valueOf(money);
		double m = ac.getBalance() + amount;
		ac.setBalance(m);

		// c.setAccount().setBalance(m);
		Transaction tx = ses.beginTransaction();
		String hql = "update Account set balance = :new " + "where accountno = :acno";
		Query query = ses.createQuery(hql);
		query.setParameter("new", m);
		query.setParameter("acno", ac.getAccountNo());
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		String type = "credit";
		// Account ac1 = ac.getAccountNo();
		String branch = ac.getBranchName(); 
		String ifsc = new String();
		
		
		switch(branch) {
		case "delhi":
			ifsc="CNRB2001";
			break;
		case "surajpur":
			ifsc="CNRB2002";
			break;
		case "faridabad":
			ifsc="CNRB2003";
			break;
		case "gurgaon":
			ifsc="CNRB2004";
			break;
		}
		
		Transactions tr = new Transactions(type, ifsc , amount, new Date(), ac);
		ses.save(tr);
		tx.commit();
		System.out.println("Deposited");
		ses.close();
		sf.close();

		return "Money Deposited";
	}

	@Override
	public String withdraw(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer LoginCheck(String username, String password) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Query q = ses.createQuery("from Customer where username=:username AND password =:password");
		q.setParameter("username", username);
		q.setParameter("password", password);		
		
		List<Customer> li = q.getResultList();

		if(li.size()>0)
			return li.get(0);
		else
			return null;
	}

}
