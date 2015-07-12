package twoDo.models;

import twoDo.api.Task;
import twoDo.TwoDoTestCase;

public class UserTaskTest extends TwoDoTestCase
{	
	protected Task userTask;
	
	public UserTaskTest(String method)
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		userTask = new UserTask(USER_ID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
	}
	
	public void testGetName()
	{	
		String expected = NAME;
		String actual = userTask.getName();
		
		assertEquals(expected, actual);
	}
	
	public void testGetContent()
	{
		String expected = CONTENT;
		String actual = userTask.getContent();
		
		assertEquals(expected, actual);
	}
	
	public void testGetUserId()
	{
		int expected = USER_ID;
		int actual = userTask.getUserId();
		
		assertEquals(expected, actual);
	}
	
	public void testGetIsDeleted()
	{
		boolean expected = IS_DELETED;
		boolean actual = userTask.isDeleted();
		
		assertEquals(expected, actual);
	}
	
	public void testGetIsCompleted()
	{
		boolean expected = IS_COMPLETED;
		boolean actual = userTask.isCompleted();
		
		assertEquals(expected, actual);
	}
	
	public void testSetIsDeleted()
	{
		userTask.setDeleted(true);
		
		assertTrue(userTask.isDeleted());
	}
	
	public void testSetIsCompleted()
	{	
		userTask.setCompleted(true);
		
		assertTrue(userTask.isCompleted());
	}
}
