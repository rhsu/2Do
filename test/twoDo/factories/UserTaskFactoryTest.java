package twoDo.factories;

import twoDo.api.factories.UserTaskFactory;
import twoDo.TwoDoTestCase;
import twoDo.api.Task;
import twoDo.api.factories.TaskFactory;
import twoDo.models.UserTask;

public class UserTaskFactoryTest extends TwoDoTestCase
{
	private TaskFactory factory;
	
	public UserTaskFactoryTest(String method) 
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		factory = new UserTaskFactory();
	}
	
	public void testCreateTask()
	{
		Task expected = new UserTask(NAME, 
			CONTENT, 
			IS_DELETED, 
			IS_COMPLETED);
		
		Task actual = factory.createTask(NAME, 
			CONTENT, 
			IS_DELETED, 
			IS_COMPLETED);
		
		assertEqualTask(expected, actual);
	}
}