package com.tigers.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import com.tigers.entity.User;


public interface AccountDao {
	boolean insertRecord(User user) throws ClassNotFoundException,SQLException;
	boolean deleteRecord(int userId) throws ClassNotFoundException,SQLException;
	User searchRecord(int userId) throws ClassNotFoundException,SQLException;
	ArrayList<User> getAllRecords()throws ClassNotFoundException,SQLException;
	boolean update(User user,int amount);
	// - or + in service
	
}
