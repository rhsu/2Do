package twoDo.api.factories;

import twoDo.ApplicationWrapper;
import twoDo.api.TaskService;
import twoDo.services.UserTaskService;

public class UserTaskServiceFactory implements TaskServiceFactory
{
	@Override
	public TaskService createTaskService() 
	{
		return new UserTaskService(
			ApplicationWrapper.GetUserTaskFactory(),
			ApplicationWrapper.GetAppContextFactory());
	}
}
