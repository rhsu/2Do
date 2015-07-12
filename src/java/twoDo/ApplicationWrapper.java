package twoDo;

import twoDo.api.TaskService;
import twoDo.api.factories.TaskFactory;
import twoDo.factories.UserTaskFactory;
import twoDo.services.UserTaskService;

/**
 * Static methods that the entire application needs
 * @author robert
 */
public class ApplicationWrapper 
{
	public static TaskService GetUserTaskService()
	{	
		return new UserTaskService(
			GetUserTaskFactory());
	}
	
	public static TaskFactory GetUserTaskFactory()
	{
		return new UserTaskFactory();
	}
}
