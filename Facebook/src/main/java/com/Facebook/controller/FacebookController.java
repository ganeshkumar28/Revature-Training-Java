package com.Facebook.controller;

import java.util.Scanner;

import com.Facebook.entity.FacebookUser;
import com.Facebook.service.FacebookService;
import com.Facebook.service.FacebookServiceController;

public class FacebookController implements FacebookControllerInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter passwoed : ");
		String password = sc.next();
		System.out.println("Enter Email :");
		String email = sc.next();
		System.out.println("Enter address : ");
		String address = sc.next();
		
		FacebookUser fu = new FacebookUser();
		fu.setName(name);
		fu.setPassword(password);
		fu.setName(email);
		fu.setAddress(address);
		FacebookServiceController fs= new FacebookService();
		
		
		int i = fs.createProfile(fu);
		
		if(i>0) {
			System.out.println("Profile Created");
		}else {
			System.out.println("Profile rejected");
		}
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewallProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfile() {
		// TODO Auto-generated method stub
		
	}

}
