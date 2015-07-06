package twoDo.models;

import twoDo.TwoDoTestCase;

public class UserTaskTest extends TwoDoTestCase
{
	private static final String NAME = "My Task";
	private static final String CONTENT = "This is the content of my task";
	private static final int USERID = 1;
	private static final boolean IS_DELETED = false;
	private static final boolean IS_COMPLETED = false;
	
	public UserTaskTest(String method)
	{
		super(method);
	}
	
	public void testGetName()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		String expected = NAME;
		String actual = userTask.getName();
		
		assertEquals(expected, actual);
	}
	
	public void testGetContent()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		String expected = CONTENT;
		String actual = userTask.getContent();
		
		assertEquals(expected, actual);
	}
	
	public void testGetUserId()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		int expected = USERID;
		int actual = userTask.getUserId();
		
		assertEquals(expected, actual);
	}
	
	public void testGetIsDeleted()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		boolean expected = IS_DELETED;
		boolean actual = userTask.isDeleted();
		
		assertEquals(expected, actual);
	}
	
	public void testGetIsCompleted()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		boolean expected = IS_COMPLETED;
		boolean actual = userTask.isCompleted();
		
		assertEquals(expected, actual);
	}
	
	public void testSetIsDeleted()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		userTask.setDeleted(true);
		
		assertTrue(userTask.isDeleted());
	}
	
	public void testSetIsCompleted()
	{
		Task userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
		
		userTask.setCompleted(true);
		
		assertTrue(userTask.isCompleted());
	}
}
