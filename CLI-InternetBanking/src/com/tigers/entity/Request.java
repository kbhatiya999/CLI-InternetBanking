package com.tigers.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

public class Request {
	private int uId;
	private String requestType;
	private Timestamp reqTS;
	//private Date reqDate;
	//private Time reqTime;
	
	public Request() {}

	public Request(int uId, String requestType, Timestamp reqTS, Date reqDate, Time reqTime) {
		super();
		this.uId = uId;
		this.requestType = requestType;
		this.reqTS = reqTS;
	
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Timestamp getReqTS() {
		return reqTS;
	}

	public void setReqTS(Timestamp reqTS) {
		this.reqTS = reqTS;
	}



	@Override
	public String toString() {
		return "Request [uId=" + uId + ", requestType=" + requestType + ", reqTS=" + reqTS +  "]";
	}

	
	
	
}
