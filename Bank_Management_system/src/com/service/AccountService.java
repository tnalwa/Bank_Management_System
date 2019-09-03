package com.service;

import com.bean.Account;
import com.bean.Customer;

public interface AccountService {
	
	public Account createAcccount(String name,String username, String password, String address, String phoneno, String email,String type,String bname);
	public String deposit(Account c, String money);
	public String withdraw(Customer c);
	public Customer LoginCheck(String username, String password);
	

}

