package provider;

import java.util.List;
import models.Task;

public interface TaskProvider 
{
	public void createTask();
	public void deleteTask();
	public List<Task> getTasks();
}
