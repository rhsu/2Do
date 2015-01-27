package provider;

import java.util.List;
import models.UserTask;

public class UserTaskProvider
{
	public void createTaks(String name, String content) 
	{
		UserTask task = new UserTask(name, content);
	}

	public void deleteTask() 
	{
		// TODO: database call that deletes task
	}

	public List<UserTask> getTasks(int userId) 
	{
		return null;
	}
}
