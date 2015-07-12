package twoDo;

import twoDo.api.factories.TaskFactory;
import twoDo.factories.UserTaskFactory;

/**
 * Static methods that the entire application needs
 * @author robert
 */
public class ApplicationWrapper 
{
	public static TaskFactory GetUserTaskService()
	{
		return new UserTaskFactory();
	}
}
