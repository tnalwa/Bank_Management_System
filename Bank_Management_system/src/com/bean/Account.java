package com.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@SequenceGenerator(name="seq", sequenceName="acseq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private long accountNo;
	private String accountType;
	private String name;
	private double balance;
	private String branchName;
	

	public Account (String accountType, String name, double balance, String branchName) {
		super();
		this.accountType = accountType;
		this.name = name;
		this.balance = balance;
		this.branchName = branchName;
	}
	public Account() {}
	@OneToMany(mappedBy="account", cascade=CascadeType.ALL)
	private Set<Transactions> transaction;
	
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
	private Customer customer;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Set<Transactions> getTransaction() {
		return transaction;
	}

	public void setTransaction(Set<Transactions> transaction) {
		this.transaction = transaction;
	}
	
	
	
}
