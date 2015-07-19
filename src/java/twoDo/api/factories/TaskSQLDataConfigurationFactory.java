package twoDo.api.factories;

import twoDo.api.SQLDataConfiguration;
import twoDo.dataLayer.TaskSQLDataConfiguration;

public class TaskSQLDataConfigurationFactory 
	implements SQLDataConfigurationFactory
{
	@Override
	public SQLDataConfiguration createSQLDataConfiguration()
	{
		return new TaskSQLDataConfiguration();
	}
}
