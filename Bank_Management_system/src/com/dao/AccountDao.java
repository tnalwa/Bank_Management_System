package com.dao;

import com.bean.Account;
import com.bean.Customer;

public interface AccountDao {
	public Account createAcccount(String name,String username, String password, String address, String phoneno, String email,String type,String bname);
	public String deposit(Account c,String money);
	public String withdraw(Customer c);
	public Customer LoginCheck(String username, String password);
	

}
