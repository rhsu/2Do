package twoDo.services;

import twoDo.ApplicationWrapper;
import twoDo.TwoDoTestCase;
import twoDo.api.SQLDataConfiguration;

public class TaskSQLDataConfigurationTest extends TwoDoTestCase
{
	private SQLDataConfiguration config;
	
	public TaskSQLDataConfigurationTest(String method) 
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		config = ApplicationWrapper.GetSQLDataConfigurationFactory()
				.createSQLDataConfiguration();
	}
}
