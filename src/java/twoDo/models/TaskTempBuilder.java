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
	private boolean isCompleted;
	private boolean isDeleted;
	
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
	
	public TaskTempBuilder setIsDeleted(boolean isDeleted)
	{
		this.isDeleted = isDeleted;
		return this;
	}
	
	public TaskTempBuilder setIsCompleted(boolean isCompleted)
	{
		this.isCompleted = isCompleted;
		return this;
	}
	
	public TaskTemp buildTaskTemp()
	{
		return new TaskTemp(userId, 
			name, 
			content,
			isCompleted,
			isDeleted);
	}
}
