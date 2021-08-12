package net.amdocs.registration.dao;



import java.sql.*;

import net.amdocs.registration.model.Feedback;


public class FeedbackDao {
	public  int registerFeedback(Feedback feedback)throws ClassNotFoundException
	{
		String INSERT_USERS_SQL = "INSERT INTO feedback" + " ( Name, user_id, Email, Feedback) VALUES "
				+ " (?, ?, ?, ?); " ; 
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql:// localhost:3306/user", "root", "8978");
				
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		{
			preparedStatement.setString(1, feedback.getName());
			preparedStatement.setInt(2,feedback.getUser_id());
			preparedStatement.setString(3,feedback.getEmail());
			preparedStatement.setString(4, feedback.getFeedback());
			
			System.out.println(preparedStatement);
			
			result= preparedStatement.executeUpdate();
		}
		catch (SQLException d)
		{
			d.printStackTrace();
			
		}
		return result;
		
			
			
			
		}
	

}
