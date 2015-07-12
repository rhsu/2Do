package twoDo.models;

import twoDo.api.Task;
import twoDo.TwoDoTestCase;

public class UserTaskTest extends TwoDoTestCase
{
	private static final String NAME = "My Task";
	private static final String CONTENT = "This is the content of my task";
	private static final int USERID = 1;
	private static final boolean IS_DELETED = false;
	private static final boolean IS_COMPLETED = false;
	
	protected Task userTask;
	
	public UserTaskTest(String method)
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		userTask = new UserTask(USERID, NAME, CONTENT, IS_DELETED, IS_COMPLETED);
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
		int expected = USERID;
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
