package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable {
	private static final long seriaVersionUID =1L;
	
	private String userName;
	private String password;
	
	
	private void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	private void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

}
