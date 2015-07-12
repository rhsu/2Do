package twoDo;

import junit.framework.TestCase;
import twoDo.api.Task;

public abstract class TwoDoTestCase extends TestCase
{
	protected static final int USER_ID = 1;
	protected static final String NAME = "My Task";
	protected static final String CONTENT = "This is the content of my task";
	protected static final boolean IS_DELETED = false;
	protected static final boolean IS_COMPLETED = false;
	
	public TwoDoTestCase(String method)
	{
		super(method);
	}
	
	public static void assertEqualTask(Task actual, Task expected)
	{
		assertEqualTask(null, actual, expected);
	}
	
	public static void assertEqualTask(String message, Task actual, Task expected)
	{
		assertEquals(message, actual.getUserId(), expected.getUserId());
		assertEquals(message, actual.getName(), expected.getName());
		assertEquals(message, actual.getContent(), expected.getContent());
		assertEquals(message, actual.isDeleted(), expected.isDeleted());
		assertEquals(message, actual.isCompleted(), expected.isCompleted());
	}
}
