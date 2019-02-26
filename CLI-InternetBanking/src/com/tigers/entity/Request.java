package com.tigers.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

public class Request {
	private int account_no;
	private String requestType;
	private Timestamp req_time;
	private char status;
	public Request(int account_no, String requestType, Timestamp req_time, char status) {
		super();
		this.account_no = account_no;
		this.requestType = requestType;
		this.req_time = req_time;
		this.status = status;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public Timestamp getReq_time() {
		return req_time;
	}
	public void setReq_time(Timestamp req_time) {
		this.req_time = req_time;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
	
	
}
