package com.tigers.service;
import java.sql.SQLException;
import java.util.ArrayList;
import com.tigers.entity.Account;

	public interface AccountService {

		boolean insertUser(Account user)throws ClassNotFoundException,SQLException;
		boolean deleteUser(int uId)throws ClassNotFoundException,SQLException;
		Account searchUser(int uId)throws ClassNotFoundException,SQLException;
		ArrayList<Account> getAllUsers()throws ClassNotFoundException,SQLException;
	}
