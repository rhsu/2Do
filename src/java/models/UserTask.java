package models;

public class UserTask
{
	private final String name;
	private final String content;
	// private final int userId;
	
	public UserTask(String name, String content)
	{
		this.name = name;
		this.content = content;
	}

	public String getName(String name) { return this.name; }
	
	public String getContent(String content) { return this.content; }
}
