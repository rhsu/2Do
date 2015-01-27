package models;

public class Task 
{
	private final String name;
	private final String content;
	
	public Task(String name, String content)
	{
		this.name = name;
		this.content = content;
	}
	
	public String getName(String name) { return this.name; }
	public String getContent(String content) { return this.content; }
}
