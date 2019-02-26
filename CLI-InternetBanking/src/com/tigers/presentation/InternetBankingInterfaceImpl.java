package com.tigers.presentation;

import java.util.Scanner;

import com.tigers.entity.User;
import com.tigers.service.AccountService;
import com.tigers.service.AccountServiceImpl;

public class InternetBankingInterfaceImpl implements InternetBankingInterface {

	

	
	@Override
	public int userLogin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your login id:");
		int id=sc.nextInt();
		System.out.println("enter password:");
		String passsword=sc.next();
		User user=new User();
		user=AccountService.searchUser(id);
		
		return 0;
	}
		
		@Override
		public void showUserMenu() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void performOnUserMenu() {
			// TODO Auto-generated method stub
			
		}
		
	}

	

	


