package net.amdocs.registration.dao;

import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

import net.amdocs.registration.dao.*;
import net.amdocs.registration.model.Contact;

  public class ContactDao{
	

	public  int registerContact(Contact contact)throws ClassNotFoundException
	{
		String INSERT_USERS_SQL = "INSERT_INTO_contact" + " (user_id, Name, Email, Phone, Message) VALUES " + "( ?,?,?,?,? ); ";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
				
		try(Connection connection = DriverManager.getConnection("jdbc:mysql:// localhost:3306/user", "root", "8978");
				
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		{
		preparedStatement.setInt(1, contact.getUser_id());
				
				preparedStatement.setString(2,contact.getName());
				preparedStatement.setString(3, contact.getEmail());
				preparedStatement.setInt(4, contact.getPhone());
				preparedStatement.setString(5, contact.getMessage());
				
				System.out.println(preparedStatement);
				result = preparedStatement.executeUpdate();
				
	}
	catch (SQLException b)
	{
		b.printStackTrace();
	}
	return result;
	}
  }
		
			
