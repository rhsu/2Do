package twoDo.models;

/**
 *
 * @author robert
 */
public class TaskTempBuilder 
{
	private int userId;
	private String name;
	private String content;
	
	public TaskTempBuilder() { }
	
	public TaskTempBuilder setUserId(int userId)
	{
		this.userId = userId;
		return this;
	}
	
	public TaskTempBuilder setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public TaskTempBuilder setContent(String content)
	{
		this.content = content;
		return this;
	}
	
	public TaskTemp buildTaskTemp()
	{
		return new TaskTemp(userId, name, content);
	}
}
