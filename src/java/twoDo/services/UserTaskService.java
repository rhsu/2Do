package twoDo.services;

import twoDo.api.TaskService;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import twoDo.dataLayer.DataLayer;
import twoDo.api.Task;
import twoDo.models.UserTask;

public class UserTaskService implements TaskService
{
	private final DataLayer dataLayer;
	
	public UserTaskService()
	{
		dataLayer = new DataLayer();
	}
	
	@Override
	public void insertTask(Task task) 
	{	
		Connection connection = null;
		CallableStatement statement = null;
		
		try
		{
			connection = dataLayer.getConnection();
			statement = connection.prepareCall("{call Task_Create(?, ?)}");
			statement.setString("pTaskName", task.getName());
			statement.setString("pTaskContent", task.getContent());
			// statement.setInt("pUserId", task.getUserId());
			statement.executeUpdate();
		}
		catch(SQLException ex)
		{
			Logger.getLogger(UserTaskService.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally
		{
			closeConnections(connection, statement, null);
		}
	}
	
	@Override
	public void updateTask(UserTask task)
	{
		Connection connection = null;
		CallableStatement statement = null;
		ResultSet rs = null;
		
		try
		{
			connection = dataLayer.getConnection();
			statement = connection.prepareCall("{ call Task_Update(?, ?) }");
			statement.setString("pContent", task.getContent());
			statement.setString("pName", task.getName());
			
			// TODO: When Deleting task, we need this extra select field.
			// statement.setBoolean("pIsActive", task.isActive());
			
			statement.executeUpdate();
		}
		catch (SQLException ex)
		{
			Logger.getLogger(UserTaskService.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally
		{
			closeConnections(connection, statement, rs);
		}
	}

	@Override
	public List<Task> getTasks(int userId) 
	{
		List<Task> tasks = new ArrayList<>();
		Connection connection = null;
		CallableStatement statement = null;
		ResultSet rs = null;
		
		try 
		{			
			connection = dataLayer.getConnection();
			statement = connection.prepareCall("{call Task_Select() }");
			// statement.setInt("pUserId", userId);
			
			rs = statement.executeQuery();
			
			while (rs.next())
			{
				Task task = this.createTaskFromReader(rs, userId);

				tasks.add(task);
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(UserTaskService.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally
		{
			closeConnections(connection, statement, rs);
		}
		
		
		return tasks;
	}
	
	@Override
	public void deleteTask(int taskId) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	Task createTaskFromReader(ResultSet rs, int userId) throws SQLException
	{
		String name = rs.getString("Name");
		String content = rs.getString("Content");
		Boolean isDeleted = rs.getBoolean("IsDeleted");
		Boolean isCompleted = rs.getBoolean("IsCompleted");
		Task task = new UserTask(userId, name, content, isDeleted, isCompleted);
		return task;
	}
	
	private void closeConnections(Connection connection, 
			CallableStatement statement,
			ResultSet rs)
	{
		if (connection != null)
			try { connection.close(); } catch (Exception e) { }
		
		if (statement != null)
			try { statement.close();  } catch (Exception e) { }
		
		if (rs != null)
			try { rs.close();		  } catch (Exception e) { }
	}
}
