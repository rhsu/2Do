package twoDo.dataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import twoDo.api.SQLDataConfiguration;

public class TaskSQLDataConfiguration implements SQLDataConfiguration
{
	private final String username;
	private final String password;
	private final String connectionString;
	
	public TaskSQLDataConfiguration()
	{
		this.username = "root";
		this.password = "password";
		this.connectionString = "jdbc:mysql://localhost:3306/2Do";
	}
	
	public TaskSQLDataConfiguration(String username, 
			String password,
			String url,
			int portNumber,
			String databaseName)
	{
		this.username = username;
		this.password = password;
		this.connectionString = createConnectionStringFromFields(url,
			portNumber, 
			databaseName);
	}
	
	public TaskSQLDataConfiguration(String username, 
			String password, 
			String connectionString)
	{
		this.username = username;
		this.password = password;
		this.connectionString = connectionString;
	}
	
	private String createConnectionStringFromFields(String url, 
			int portNumber, String databaseName)
	{
		String connString = url + portNumber 
				+ "/" + databaseName;
		
		return connString;
	}
	
	@Override
	public Connection CreateSqlConnection() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager
					.getConnection(this.connectionString,
							this.username,
							this.password);
		}
		catch (ClassNotFoundException | SQLException ex) 
		{
			Logger.getLogger(DataLayer.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}
}
