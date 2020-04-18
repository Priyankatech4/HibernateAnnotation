package com.xyz.Hibernatedb.DAOModel;

import javax.persistence.Id;

public class UserModel 
{
	 @Id	
	  private int Userid;
	  private String Username;
	  private String UserAddress;
	  private String Useremail;
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int Userid) {
		this.Userid = Userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getUserAdress() {
		return UserAddress;
	}
	
	public void setUserAddress(String UserAddress) {
		this.UserAddress = UserAddress;
	}
	public String getUseremail() {
		return Useremail;
	}
	public void setUseremail(String Useremail) {
		this.Useremail = Useremail;
	}

}
