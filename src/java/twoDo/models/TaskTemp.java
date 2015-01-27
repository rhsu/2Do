package twoDo.models;

public class TaskTemp 
{
	private final String name;
	private final String content;
	// private final int userId;
	
	public TaskTemp(String name, String content)
	{
		this.name = name;
		this.content = content;
	}

	public String getName() { return this.name; }
	
	public String getContent() { return this.content; }	
	
	@Override
	public String toString()
	{
		return this.name + " " + this.content;
	}
}