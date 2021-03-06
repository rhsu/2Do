package twoDo.api.factories;

import twoDo.api.Task;
import twoDo.models.UserTask;

public class UserTaskFactory implements TaskFactory
{
	@Override
	public Task createTask(String name, 
		String content, 
		boolean isDeleted, 
		boolean isCompleted) 
	{
		return new UserTask(name, content, isDeleted, isCompleted);
	}
}
