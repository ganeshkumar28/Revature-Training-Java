package com.Facebook.view;

import java.util.Scanner;

import com.Facebook.controller.FacebookController;
import com.Facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************** MAIN MENU *****************************");
		System.out.println(" 1. Create Profile ");
		System.out.println(" 2. View Profile ");
		System.out.println(" 3. Delete  Profile ");
		System.out.println(" 4. Edit Profile ");
		System.out.println(" 5. Search  Profile ");
		System.out.println(" 6. View all Profile ");
		System.out.println(" 7. Login Profile ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice : ");
		int choice = sc.nextInt();
		
		FacebookControllerInterface fc = new FacebookController();
		
		switch(choice) {
		case 1 : fc.createProfile();
				break;
		case 2 :fc.viewProfile();
				break;
		case 3 :fc.deleteProfile();
				break;
		case 4 :fc.editProfile();
				break;
		case 5 :fc.searchProfile();
				break;
		case 6 :fc.viewallProfile();
				break;
		case 7 :fc.loginProfile();
				break;
		default :System.out.println("Invalid Choice");
		}
		

	}

}
