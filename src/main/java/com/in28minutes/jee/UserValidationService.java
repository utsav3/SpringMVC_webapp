package com.in28minutes.jee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password){
		return user.equals("Utsav") && password.equals("password");
	}

}



