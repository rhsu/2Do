package twoDo.providers;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import twDo.dataLayer.DataLayer;
import twoDo.models.TaskTemp;
import twoDo.models.TaskTempBuilder;

public class TaskTempProvider 
{
	private final DataLayer dataLayer;
	private Connection connection = null;
	private CallableStatement statement = null;
	private ResultSet rs = null;
	
	public TaskTempProvider()
	{
		dataLayer = new DataLayer();
	}
	
	public void insertTask(int userId, String name, String content) 
	{	
		try
		{
			connection = dataLayer.getConnection();
			statement = connection.prepareCall("{call Task_Create(?, ?)}");
			statement.setString("pTaskName", name);
			statement.setString("pTaskContent", content);
			// statement.setInt("pUserId", userId);
			statement.executeUpdate();
		}
		catch(SQLException ex)
		{
			Logger.getLogger(TaskTempProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally
		{
			try { connection.close(); } catch (Exception e) { }
			try { statement.close();  } catch (Exception e) { }
			try { rs.close();		  } catch (Exception e) { }
		}
	}

	public void deleteTask() 
	{
		//TODO:
	}

	public List<TaskTemp> getTasks(int userId) 
	{
		List<TaskTemp> tasks = new ArrayList<>();
		
		try 
		{			
			connection = dataLayer.getConnection();
			statement = connection.prepareCall("{call Task_Select() }");
			// statement.setInt("pUserId", userId);
			
			rs = statement.executeQuery();
			
			while (rs.next())
			{
				String name = rs.getString("Name");
				String content = rs.getString("Content");
				TaskTemp task = new TaskTempBuilder()
					.setUserId(userId)
					.setName(name)
					.setContent(content)
					.buildTaskTemp();
				
				tasks.add(task);
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(TaskTempProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally
		{
			try { connection.close(); } catch (Exception e) { }
			try { statement.close();  } catch (Exception e) { }
			try { rs.close();		  } catch (Exception e) { }
		}
		
		
		return tasks;
	}
}
