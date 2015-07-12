package twoDo.models;

import twoDo.api.Task;

public class UserTask implements Task
{
	private final int userId;
	private final String name;
	private final String content;
	private boolean isDeleted;
	private boolean isCompleted;
	
	public UserTask(int userId, 
			String name, 
			String content, 
			boolean isDeleted,
			boolean isCompleted)
	{
		this.name = name;
		this.content = content;
		this.userId = userId;
		this.isDeleted = isDeleted;
		this.isCompleted = isCompleted;
	}

	@Override
	public String getName() { return this.name; }
	
	@Override
	public String getContent() { return this.content; }	
	
	@Override
	public int getUserId() { return this.userId; }
	
	@Override
	public boolean isDeleted() { return this.isDeleted; }
	
	@Override
	public boolean isCompleted() { return this.isCompleted; }
	
	@Override
	public String toString()
	{
		return this.name + " " + this.content;
	}

	@Override
	public void setDeleted(boolean deleted) 
	{
		this.isDeleted = deleted;
	}

	@Override
	public void setCompleted(boolean completed) 
	{
		this.isCompleted = completed;
	}
}