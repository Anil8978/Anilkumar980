package net.amdocs.registration.dao;

import java.sql.*;

import net.amdocs.registration.model.Admin;
import net.amdocs.registration.model.Feedback;
import net.amdocs.registration.model.user;

public class AdminDao {
	
	
	public  int registerAdmin(Admin admin)throws ClassNotFoundException
	{
		String INSERT_USERS_SQL = "INSERT INTO admin " + " ( Admin_id, Password, Name, Email) VALUES "
				+ " (?, ?, ?, ?); " ;
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql:// localhost:3306/user", "root", "8978");
				
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		{
			preparedStatement.setInt(1, admin.getAdmin_id());
			preparedStatement.setString(2,admin.getPassword());
			preparedStatement.setString(3,admin.getName());
			preparedStatement.setString(4, admin.getEmail());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
			
		}catch(SQLException f)
		{
			f.printStackTrace();
		}
		return result;
		
	
}
}
