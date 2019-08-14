package com.wipro.fms.bean;

public class Passenger_ProfileBean
{
	private int profile_id;
	private String password;
	private String first_name;
	private String last_name;
	private int tel_no;
	private String email_id;
	

	Passenger_ProfileBean()
	{
		
	}
	
	
	Passenger_ProfileBean(String password,String first_name,String last_name,int tel_no,String email_id)
	{
		super();
		this.profile_id=profile_id;
		this.email_id=email_id;
		this.first_name=first_name;
		this.last_name=last_name;
		this.tel_no=tel_no;
		
	}
	
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	public int getTel_no() {
		return tel_no;
	}
	public void setTel_no(int tel_no) {
		this.tel_no = tel_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	

}


