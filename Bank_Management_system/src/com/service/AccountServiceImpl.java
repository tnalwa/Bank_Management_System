package com.service;

import com.bean.Account;
import com.bean.Customer;
import com.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	 AccountDaoImpl ad = new  AccountDaoImpl();
	@Override
	public Account createAcccount(String name, String username, String password, String address, String phoneno,
			String email, String type, String bname) {
		
		return ad.createAcccount(name, username, password, address, phoneno, email, type, bname);
	}
	@Override
	public String deposit(Account c,String money) {
		// TODO Auto-generated method stub
		return ad.deposit(c,money);
	}
	@Override
	public String withdraw(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer LoginCheck( String username, String password) {
		// TODO Auto-generated method stub
		return ad.LoginCheck(username, password);
	}
	
	
}
