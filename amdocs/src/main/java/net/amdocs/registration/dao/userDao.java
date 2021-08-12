package net.amdocs.registration.dao;

import java.sql.SQLException; 
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

  
import net.amdocs.registration.model.user;

public class userDao {
	public  int registerStudent(user data)throws ClassNotFoundException
	{
		String INSERT_USERS_SQL = "INSERT INTO data " + " ( name, id, address, password, email, phone_no, reg_date) VALUES "
				+ " (?, ?, ?, ?, ?, ?,?); " ;
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql:// localhost:3306/user", "root", "8978");
				
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		{
			preparedStatement.setString(1, data.getName());
			preparedStatement.setInt(2,data.getId());
			preparedStatement.setString(3, data.getAddress());
			preparedStatement.setString(4, data.getPassword());
			preparedStatement.setString(5, data.getEmail());
			preparedStatement.setInt(6, data.getPhone_no());
			preparedStatement.setInt(7, data.getReg_date());
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
			
		}
		catch (SQLException a)
		{
			a.printStackTrace();
		}
		return result;
	}

}
