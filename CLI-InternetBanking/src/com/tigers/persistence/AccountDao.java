package com.tigers.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import com.tigers.entity.Account;


public interface AccountDao {
	boolean insertRecord(Account user) throws ClassNotFoundException,SQLException;
	boolean deleteRecord(int userId) throws ClassNotFoundException,SQLException;
	Account searchRecord(int userId) throws ClassNotFoundException,SQLException;
	ArrayList<Account> getAllRecords()throws ClassNotFoundException,SQLException;
	boolean update(Account user,int amount);
	// - or + in service
	
}
