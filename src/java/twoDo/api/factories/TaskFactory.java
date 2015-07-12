package twoDo.api.factories;

import twoDo.api.Task;

public interface TaskFactory 
{
	public Task createTask(int userId, 
			String name, 
			String content, 
			boolean isDeleted,
			boolean isCompleted);
}
