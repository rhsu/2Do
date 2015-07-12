package twoDo.api;

import java.util.List;

public interface TaskService 
{
	public void insertTask(Task task);
	
	public void updateTask(Task task);
	
	public List<Task> getTasks(int userId);
	
	public void deleteTask(int taskId);
}
