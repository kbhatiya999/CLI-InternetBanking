package com.tigers.client;

import java.util.Scanner;

import com.tigers.presentation.AdminstrativeUserInterface;
import com.tigers.presentation.AdmistrativeUserInterfaceImpl;
import com.tigers.presentation.InternetBankingInterface;
import com.tigers.presentation.InternetBankingInterfaceImpl;



public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternetBankingInterface internetBankingInterface= new InternetBankingInterfaceImpl();
		
		AdminstrativeUserInterface admistrativeUserInterface= new AdmistrativeUserInterfaceImpl();
		Scanner sc =new Scanner(System.in);
		while(true){
			//internetBankingInterface.showUserMenu();
			System.out.println("1.User login");
			System.out.println("2.Adminstrative login");
			System.out.println("3.exit");
			System.out.println("Enter Choice : ");
			int choice =sc.nextInt();
			if(choice==1)
			     internetBankingInterface.userLogin();
			else if(choice==2)
				admistrativeUserInterface.adminstrativeLogin();
			else
				System.exit(0);
		}

	}

}
