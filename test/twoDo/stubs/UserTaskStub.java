package twoDo.stubs;

import twoDo.api.Task;

public class UserTaskStub implements Task
{
	public UserTaskStub() throws Exception
	{
		throw new Exception("Why am I using this?");
	}
	
	@Override
	public String getName() 
	{
		return "getName";
	}

	@Override
	public String getContent() 
	{
		return "getContent";
	}

	@Override
	public int getUserId() 
	{
		return 100;
	}

	@Override
	public void setDeleted(boolean deleted) 
	{
		
	}

	@Override
	public void setCompleted(boolean completed) 
	{
		
	}

	@Override
	public boolean isDeleted() 
	{
		return true;
	}

	@Override
	public boolean isCompleted() 
	{
		return false;
	}
	
}
