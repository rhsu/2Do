package twoDo.dataLayer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDataReader 
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private CallableStatement cst;
	
	public SqlDataReader()
	{
		try
		{
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/2Do",
							"root",
							"password");
			st = con.createStatement();
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}
	
	public void getData()
	{
		try
		{
			String query = "SELECT * FROM Task";
			rs = st.executeQuery(query);
			
			System.out.println("Records from database");
			
			while(rs.next())
			{
				String name = rs.getString("Name");
				String content = rs.getString("Content");
				System.out.println(name + " " + content);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public void insertRecord(String name, String content)
	{
		try
		{
			cst = con.prepareCall("{call Task_Create(?, ?)}");
			cst.setString("pTaskName", name);
			cst.setString("pTaskContent", content);
			
			cst.executeUpdate();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args)
	{
		SqlDataReader test = new SqlDataReader();
		// test.getData();
		test.insertRecord("name", "test");
	}
}
