package com.practice.jee;

public class LoginService {
	
	public boolean validateuser(String user, String password) {
		return user.equals("admin") && password.equals("admin");
	}

}
