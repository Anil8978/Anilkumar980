package net.amdocs.registration.model;

public class user {
	private String name;
	private int id;
	private String address;
	private String password;
	private String email;
	private int phone_no;
	private int reg_date;
	public int getPhone_no() {
		
return  phone_no;
	}
	public void setPhone_no(int phone_no)
	{
		this.phone_no=phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getReg_date() {
		return reg_date;
	}
	public void setReg_date(int reg_date) {
		this.reg_date = reg_date;
	}
	
}
