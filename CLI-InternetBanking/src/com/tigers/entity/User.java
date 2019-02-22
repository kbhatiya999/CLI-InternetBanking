package com.tigers.entity;

public class User {
	private int userId;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String password;
	private int amount;
	
	public User() {}

	public User(int userId, String name, String address, String phone, String email, String password, int amount) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.amount = amount;
	}

	public int getuId() {
		return userId;
	}

	public void setuId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "User [uId=" + userId + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ /*", password=" + password +*/ ", amount=" + amount + "]";
	}
		
}
