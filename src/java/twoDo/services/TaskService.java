package twoDo.services;

import java.util.List;
import twoDo.models.Task;
import twoDo.models.UserTask;

public interface TaskService 
{
	public void insertTask(Task task);
	
	public void updateTask(UserTask task);
	
	public List<Task> getTasks(int userId);
	
	public void deleteTask(int taskId);
}
