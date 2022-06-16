package com.selection_statement;

import java.util.Scanner;

public class LoginAuthentication {

	public static void main(String args[]) {

		int userId = 2044;
		int password = 9940;
		int userid;
		int pin = 0;
		
		System.out.println("---------Welcome to HRBerry-----------");

		System.out.println("enter the userid : ");
		Scanner id = new Scanner(System.in);
		userid = id.nextInt();
		
		
		if (userId == userid | userId != userid) {
			System.out.println("enter the pin :");
			Scanner Password = new Scanner(System.in);
			pin = Password.nextInt();
		

		if (userId != userid) {
			System.out.println("Please check the userid you have entered!!");
			}

		if (password != pin) {
			System.out.println("Please check the password you have entered!!");
			}
		
		if(userId == userid&&password == pin) {
			System.out.println("Login successfull");
			}
	}

	}
}
