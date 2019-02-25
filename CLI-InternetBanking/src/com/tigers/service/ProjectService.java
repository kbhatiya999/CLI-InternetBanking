package com.tigers.service;
import java.sql.SQLException;
import java.util.ArrayList;
import com.tigers.entity.Customer_details;
public interface ProjectService {


	public interface UserService {

		boolean insertUser(Customer_details user)throws ClassNotFoundException,SQLException;
		boolean deleteUser(int uId)throws ClassNotFoundException,SQLException;
		Customer_details searchUser(int uId)throws ClassNotFoundException,SQLException;
		ArrayList<Customer_details> getAllUsers()throws ClassNotFoundException,SQLException;
	}
}
