package com.tigers.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tigers.entity.Customer_details;
import com.tigers.util.DbConnectionHelper;

public class Customer_detailsDaoImpl implements Customer_detailsDao {
	
	@Override
	public boolean insertRecord(Customer_details customer) throws ClassNotFoundException, SQLException{
		Connection connection=DbConnectionHelper.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO CUSTOMER_DETAIS VALUES(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, customer.getuId());
		preparedStatement.setString(2, customer.getName());
		preparedStatement.setString(3, customer.getAddress());
		preparedStatement.setInt(3, customer.getPhone());
		preparedStatement.setString(4, customer.getEmail());
		preparedStatement.setString(5, customer.getPassword());
		preparedStatement.setInt(6, customer.getAmount());
		
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

	@Override
	public boolean deleteRecord(int userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer_details searchRecord(int customerID) throws ClassNotFoundException, SQLException {
		Connection connection=DbConnectionHelper.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT* FROM CUSTOMER_DETAILS WHERE USERID=?");
		preparedStatement.setInt(1, customerID);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		Customer_details customer_details=null;
		if(resultSet.next())
		{
			customer_details=new Customer_details();
			customer_details.setName(resultSet.getString("NAME"));
			customer_details.setAddress(resultSet.getString("ADDRESS"));
			customer_details.setEmail(resultSet.getString("EMAIL"));
			customer_details.setPhone(resultSet.getInt("PHONE"));
			customer_details.setAmount(resultSet.getInt("BALANCE"));
		    customer_details.setPassword(resultSet.getString("PASSWORD"));
			
		}
			
		connection.close();
		return customer_details;
	}

	@Override
	public ArrayList<Customer_details> getAllRecords() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=DbConnectionHelper.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM CUSTOMER_DETAILS");
		ResultSet resulSet=preparedStatement.executeQuery();
		ArrayList<Customer_details> CustomerList=new ArrayList<>();
		
		while(resulSet.next())
		{
			Customer_details customer_details=new Customer_details();
			
			customer_details.setName(resulSet.getString("NAME"));
			customer_details.setuId(resulSet.getInt("USERID"));
			customer_details.setEmail(resulSet.getString("EMAIL"));
			customer_details.setPassword(resulSet.getString("PASSWORD"));
			customer_details.setPhone(resulSet.getInt("PHONE"));
			customer_details.setAddress(resulSet.getString("ADDRESS"));
			customer_details.setAmount(resulSet.getInt("BALANCE"));
			
			CustomerList.add(customer_details);
			
		}
		connection.close();
		return CustomerList;
	}

	@Override
	public boolean update(Customer_details user, int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
