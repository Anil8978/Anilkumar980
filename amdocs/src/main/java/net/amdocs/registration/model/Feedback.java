package net.amdocs.registration.model;

public class Feedback {

	private String Name;
	private int user_id;
	private String Email;
	private String Feedback;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	
}
