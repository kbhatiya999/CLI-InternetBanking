package com.tigers.util;

import java.util.Scanner;


import com.tigers.entity.User;

public class UserHelper {

	public static User input(){
		Scanner scan=new Scanner(System.in);
		User user=new User();
		System.out.println("Enter User id : ");
		user.setuId(scan.nextInt());
		System.out.println("Enter User Name : ");
		user.setName(scan.next());
		System.out.println("Enter User Address : ");
		user.setAddress(scan.next());
		System.out.println("Enter User Phone No. : ");
		user.setPhone(scan.next());
		System.out.println("Enter User Email : ");
		user.setEmail(scan.next());
		System.out.println("Enter User Password : ");
		user.setPassword(scan.next());
		System.out.println("Enter Amount : ");
		user.setAmount(scan.nextInt());
		return user;
	}
}


