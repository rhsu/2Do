package twoDo.providers;

import java.util.ArrayList;
import java.util.List;
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

	public List<TaskTemp> getTasks(int userId) 
	{
		List<TaskTemp> tasks = new ArrayList<>();
		
		tasks.add(new TaskTemp("item 1", "item 1 description"));
		tasks.add(new TaskTemp("item 2", "item 1 description"));
		tasks.add(new TaskTemp("item 3", "item 1 description"));
		
		return tasks;
	}
}
