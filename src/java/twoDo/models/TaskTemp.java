package twoDo.models;

public class TaskTemp 
{
	private final String name;
	private final String content;
	private final int userId;
	
	TaskTemp(int userId, String name, String content)
	{
		this.name = name;
		this.content = content;
		this.userId = userId;
	}

	public String getName() { return this.name; }
	
	public String getContent() { return this.content; }	
	
	public int getUserId() { return this.userId; }
	
	@Override
	public String toString()
	{
		return this.name + " " + this.content;
	}
}