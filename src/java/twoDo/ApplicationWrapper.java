package twoDo;

import twoDo.api.factories.*;

/**
 * Static methods that the entire application needs
 * @author robert
 */
public class ApplicationWrapper 
{
	//<editor-fold defaultstate="collapsed" desc="Factories"> 
	
	public static ApplicationContextFactory GetAppContextFactory()
	{
		return new ApplicationContextFactory();
	}
	
	public static TaskFactory GetUserTaskFactory()
	{
		return new UserTaskFactory();
	}
	
	public static TaskServiceFactory GetUserTaskServiceFactory()
	{
		return new UserTaskServiceFactory();
	}
	
	public static SQLDataConfigurationFactory GetSQLDataConfigurationFactory()
	{
		return new TaskSQLDataConfigurationFactory();
	}
	
	//</editor-fold>
}
