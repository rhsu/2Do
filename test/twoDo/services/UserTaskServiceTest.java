package twoDo.services;

import twoDo.api.TaskService;
import twoDo.TwoDoTestCase;

public class UserTaskServiceTest extends TwoDoTestCase
{
	protected TaskService service;
	
	public UserTaskServiceTest(String method)
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		service = new UserTaskService();
	}
	
	public void testInsertTask()
	{
		
	}
	
	public void testUpdateTask()
	{
		
	}
	
	public void testGetTasks()
	{
		
	}
	
	public void testDeleteTask()
	{
		
	}
}
