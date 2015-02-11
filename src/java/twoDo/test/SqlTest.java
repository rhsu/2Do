package twoDo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlTest 
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private CallableStatement cst;
	
	public SqlTest()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/2Do",
							"root",
							"password");
			st = con.createStatement();
		}
		catch(ClassNotFoundException | SQLException ex)
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
		SqlTest test = new SqlTest();
		// test.getData();
		test.insertRecord("name", "test");
	}
}
