package com.tigers.entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class FundTransfer {
	private int uIdSender;
	private int uIdReceiver;
	private int amount;
	private Timestamp trxTS;
	//private Date trxDate;
	//private Time trxTime;
	
	public FundTransfer() {}
	
	public FundTransfer(int uIdSender, int uIdReceiver, int amount, Timestamp trxTS, Date trxDate, Time trxTime) {
		super();
		this.uIdSender = uIdSender;
		this.uIdReceiver = uIdReceiver;
		this.amount = amount;
		this.trxTS = trxTS;
		
	}

	public int getuIdSender() {
		return uIdSender;
	}

	public void setuIdSender(int uIdSender) {
		this.uIdSender = uIdSender;
	}

	public int getuIdReceiver() {
		return uIdReceiver;
	}

	public void setuIdReceiver(int uIdReceiver) {
		this.uIdReceiver = uIdReceiver;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Timestamp getTrxTS() {
		return trxTS;
	}

	public void setTrxTS(Timestamp trxTS) {
		this.trxTS = trxTS;
	}

	



	@Override
	public String toString() {
		return "FundTransfer [uIdSender=" + uIdSender + ", uIdReceiver=" + uIdReceiver + ", amount=" + amount
				+ ", trxTS=" + trxTS + "]";
	}
	
	
	
	
	
}
