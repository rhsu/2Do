package twoDo.factories;

import java.sql.Connection;
import twoDo.ApplicationWrapper;
import twoDo.TwoDoTestCase;
import twoDo.api.SQLDataConfiguration;
import twoDo.api.factories.SQLDataConfigurationFactory;

public class TaskSQLDataConfigurationFactoryTest extends TwoDoTestCase
{
	private SQLDataConfigurationFactory factory;
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "password";
	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/2Do";
	
	private static final int PORT_NUMBER = 3306;
	private static final String DATABASE_NAME = "2Do";
	private static final String URL = "jdbc:mysql://localhost:3306";
	
	public TaskSQLDataConfigurationFactoryTest(String method) 
	{
		super(method);
	}

	@Override
	public void setUp()
	{
		factory = ApplicationWrapper.GetSQLDataConfigurationFactory();
	}
	
	/**
	 * Tests the default constructor.
	 * Creates a connection object. Ensures that no exception was thrown
	 * and that the return connection is not null
	 */
	public void testConstructor1()
	{
		SQLDataConfiguration config = factory.createSQLDataConfiguration();
		
		Connection connection = config.GetSqlConnection();
		assertNotNull(connection);
	}
	
	/**
	 * Tests the constructor String username, String password, String url,
	 * int portNumber, String databaseName.
	 * Creates a connection object. Ensures that no exception was thrown
	 * and that the return connection is not null
	 */
	public void testConstructor2()
	{
		SQLDataConfiguration config = factory.createSQLDataConfiguration(
			USERNAME,
			PASSWORD,
			URL,
			PORT_NUMBER,
			DATABASE_NAME);
		
		Connection connection = config.GetSqlConnection();
		assertNotNull(connection);
	}
	
	/**
	 * Tests the constructor String username, String password, String connectionString
	 * Creates a connection object. Ensures that no exception was thrown
	 * and that the return connection is not null
	 */
	public void testConstructor3()
	{
		SQLDataConfiguration config = factory.createSQLDataConfiguration(USERNAME, PASSWORD, CONNECTION_STRING);
		
		Connection connection = config.GetSqlConnection();
		assertNotNull(connection);
	}
	
}
