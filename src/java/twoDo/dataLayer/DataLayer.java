package twoDo.dataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataLayer 
{
	public DataLayer()
	{
		
	}
		
	public Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager
					.getConnection("jdbc:mysql://localhost:3306/2Do",
							"root",
							"password");
		}
		catch (ClassNotFoundException | SQLException ex) 
		{
			Logger.getLogger(DataLayer.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}
}