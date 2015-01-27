package twoDo.providers;

import java.util.List;
import modelsExperimental.UserTask;
import twoDo.models.TaskTemp;

public class TaskTempProvider 
{
	public TaskTemp createTask(String name, String content) 
	{	
		return new TaskTemp(name, content);
	}

	/*public void deleteTask() 
	{
		// TODO: database call that deletes task
	}*/

	public List<UserTask> getTasks(int userId) 
	{
		return null;
	}
}
