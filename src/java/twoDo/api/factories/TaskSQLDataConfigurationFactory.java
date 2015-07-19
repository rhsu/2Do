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

	@Override
	public SQLDataConfiguration createSQLDataConfiguration(String username, 
			String password, 
			String url, 
			int portNumber, 
			String databaseName) 
	{
		return new TaskSQLDataConfiguration(username, password, url, portNumber, databaseName);
	}

	@Override
	public SQLDataConfiguration createSQLDataConfiguration(String username, 
			String password, 
			String connectionString) 
	{
		return new TaskSQLDataConfiguration(username, password, connectionString);
	}
}
