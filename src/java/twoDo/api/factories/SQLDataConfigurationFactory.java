package twoDo.api.factories;

import twoDo.api.SQLDataConfiguration;

public interface SQLDataConfigurationFactory 
{
	public SQLDataConfiguration createSQLDataConfiguration();
	
	public SQLDataConfiguration createSQLDataConfiguration(String username, 
			String password,
			String url,
			int portNumber,
			String databaseName);
	
	public SQLDataConfiguration createSQLDataConfiguration(String username,
			String password,
			String connectionString);
}
