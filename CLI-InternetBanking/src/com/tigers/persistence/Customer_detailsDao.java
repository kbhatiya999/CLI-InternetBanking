package com.tigers.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import com.tigers.entity.Customer_details;


public interface Customer_detailsDao {
	boolean insertRecord(Customer_details user) throws ClassNotFoundException,SQLException;
	boolean deleteRecord(int userId) throws ClassNotFoundException,SQLException;
	Customer_details searchRecord(int userId) throws ClassNotFoundException,SQLException;
	ArrayList<Customer_details> getAllRecords()throws ClassNotFoundException,SQLException;
	boolean update(Customer_details user,int amount);
	// - or + in service
	
}
