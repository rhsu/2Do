package twoDo.models;

public class TaskTemp 
{
	private final String name;
	private final String content;
	private final int userId;
	private final boolean isDeleted;
	private final boolean isCompleted;
	
	TaskTemp(int userId, 
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

	public String getName() { return this.name; }
	
	public String getContent() { return this.content; }	
	
	public int getUserId() { return this.userId; }
	
	public boolean isDeleted() { return this.isDeleted; }
	
	public boolean isCompleted() { return this.isCompleted; }
	
	@Override
	public String toString()
	{
		return this.name + " " + this.content;
	}
}