package com.tigers.entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class FundTransfer {
	private int account_no;
	private int account_no2;
	private int amount;
	private Timestamp ttime;
	private int charges;
	public FundTransfer(int account_no, int account_no2, int amount, Timestamp ttime, int charges) {
		super();
		this.account_no = account_no;
		this.account_no2 = account_no2;
		this.amount = amount;
		this.ttime = ttime;
		this.charges = charges;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getAccount_no2() {
		return account_no2;
	}
	public void setAccount_no2(int account_no2) {
		this.account_no2 = account_no2;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Timestamp getTtime() {
		return ttime;
	}
	public void setTtime(Timestamp ttime) {
		this.ttime = ttime;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	
	
	
	
}
