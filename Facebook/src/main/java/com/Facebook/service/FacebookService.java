package com.Facebook.service;

import com.Facebook.dao.Facebookdea;
import com.Facebook.dao.Facebookdeo;
import com.Facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceController {


	@Override
	public int createProfile(FacebookUser fu) {
		// TODO Auto-generated method stub
		
		Facebookdeo fd = new Facebookdea();
		int i = fd.createProfile();
		return i;
	}

}
