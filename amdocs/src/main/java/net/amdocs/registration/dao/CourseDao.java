package net.amdocs.registration.dao;


import java.sql.SQLException; 
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

import net.amdocs.registration.model.Course;



public class CourseDao {
	public  int registerCourse(Course course)throws ClassNotFoundException
	{
		String INSERT_USERS_SQL = "INSERT INTO course " + " ( course_id, Name, Description, Resource, Fees,) VALUES "
				+ " (?, ?, ?, ?, ?); " ;
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql:// localhost:3306/user", "root", "8978");
				
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		
		{
			preparedStatement.setInt(1,course.getCourse_id());
			
			preparedStatement.setString(2, course.getName());
			preparedStatement.setString(3, course.getDescription());
			preparedStatement.setString(4, course.getResource());
			preparedStatement.setInt(5,course.getFees());
			
			System.out.println("preparedStatement");
			result = preparedStatement.executeUpdate();
			
		}
		catch (SQLException c)
		{
			c.printStackTrace();
			
		}
		return result;
		
	}

	

}
