package twoDo.api.factories;

import twoDo.api.Task;

public interface TaskFactory 
{
	public Task createTask(
		String name, 
		String content, 
		boolean isDeleted,
		boolean isCompleted);
}
