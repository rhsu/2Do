package twoDo.stubs;

import twoDo.models.Task;

public class UserTaskStub implements Task
{
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
