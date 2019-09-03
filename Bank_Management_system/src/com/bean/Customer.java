package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	@Id
	@SequenceGenerator(name="seq", sequenceName="cuseq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private long customerId;
	private String username;
	private String password;
	private String address;
	private String phoneNo;
	private String email;
	
	
	@OneToOne
	@JoinColumn(name="accountNo")
	private Account account;	
	public Customer(){}
	public Customer(String username, String password, String address, String phoneNo, String email,
			Account account) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
