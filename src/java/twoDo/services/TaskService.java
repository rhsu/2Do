package twoDo.services;

import twoDo.models.Task;
import twoDo.models.UserTask;

public interface TaskService 
{
	public void insertTask(Task task);
	
	public void updateTask(UserTask task);
	
	public void getTasks(int userId);
}
