package com.tigers.service;
import java.sql.SQLException;
import java.util.ArrayList;
import com.tigers.entity.User;
public interface ProjectService {


	public interface UserService {

		boolean insertUser(User user)throws ClassNotFoundException,SQLException;
		boolean deleteUser(int uId)throws ClassNotFoundException,SQLException;
		User searchUser(int uId)throws ClassNotFoundException,SQLException;
		ArrayList<User> getAllUsers()throws ClassNotFoundException,SQLException;
	}
}
