package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Transactions {

	@Id
	@SequenceGenerator(name = "seq", sequenceName = "trseq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private long id;
	private String type;
	private String ifsc;
	private double amount;
	private Date date;

	@ManyToOne
	@JoinColumn(name = "accountNo")
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Transactions(String type, String ifsc, double amount, Date date, Account account) {
		super();
		this.type = type;
		this.ifsc = ifsc;
		this.amount = amount;
		this.date= date;
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Transactions() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

}
